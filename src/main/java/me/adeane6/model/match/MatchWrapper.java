package me.adeane6.model.match;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.adeane6.model.Entity;
import me.adeane6.model.asset.Asset;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.roster.Roster;
import me.adeane6.model.wrapper.DataList;
import me.adeane6.model.wrapper.ResponseData;
import me.adeane6.util.CollectionsUtil;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class MatchWrapper extends ResponseData<Match> {

    private List<Entity> included;

    public List<Participant> getParticipants() {
        return CollectionsUtil.filterListByClass(included, Participant.class);
    }

    public List<Roster> getRosters() {
        return CollectionsUtil.filterListByClass(included, Roster.class);
    }

    public Roster getWinner() {
        List<Roster> rosters = this.getRosters();
        return rosters.stream()
                .filter(roster -> roster.getAttributes() != null)
                .filter(roster -> Boolean.TRUE.equals(roster.getAttributes().getWon()))
                .findFirst().orElse(null);
    }

    public List<Participant> getWinners() {
        List<String> participantsIds = this.getWinner().getParticipantsIds();

        return this.getParticipants().stream()
                .filter(participant -> participantsIds.contains(participant.getId()))
                .collect(Collectors.toList());
    }

    public String getTelemetryUrl() {
        Match match = this.getData();

        MatchRelationships matchRelationships = match.getRelationships();
        DataList<Asset> assetsDataList = matchRelationships.getAssets();
        Asset asset = assetsDataList.getData().get(0);
        String telemetryAssetId = asset.getId();

        Asset telemetryAsset = included.stream()
                .filter(entity -> telemetryAssetId.equals(entity.getId())
                        && entity instanceof Asset)
                .map(Asset.class::cast)
                .findFirst().orElse(null);

        if (telemetryAsset == null) {
            return null;
        }

        return telemetryAsset.getAttributes().getUrl();
    }
}
