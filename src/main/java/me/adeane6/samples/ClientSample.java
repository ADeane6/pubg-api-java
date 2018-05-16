package me.adeane6.samples;

import me.adeane6.PUBGApi;
import me.adeane6.model.ApiStatus;
import me.adeane6.model.Shard;
import me.adeane6.model.match.Match;
import me.adeane6.model.Telemetry.LogPlayerKill;
import me.adeane6.model.Telemetry.Telemetry;
import me.adeane6.model.Telemetry.object.Character;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.player.Player;
import me.adeane6.util.CollectionsUtil;

import java.util.Comparator;
import java.util.List;


public class ClientSample {


    public static void main(String[] args) {
        PUBGApi pubgApi = new PUBGApi("<API_KEY>");

        ApiStatus status = pubgApi.status();
        System.out.println("API Status: " + status);

        Player player = pubgApi.getPlayersByNames(Shard.PC_EU, "BreaK").getData().get(0);
        System.out.println("shroud ID: " + player.getId());

        Player playerById = pubgApi.getPlayersByIds(Shard.PC_EU, player.getId()).getData().get(0);
        System.out.println(player.getId() + " NAME: " + playerById.getAttributes().getName());

        for (String matchId : player.getMatchsIds()) {
            System.out.println("Match: " + matchId);
            Match matchWrapper = pubgApi.getMatch(Shard.PC_EU, matchId);
            System.out.println("Match: " + matchId + " Type: " + matchWrapper.getData().getAttributes().getGameMode());
            Participant participant = matchWrapper.getParticipants().stream()
                    .filter(p ->  p.getAttributes().getStats().getName()
                            .equals(player.getAttributes().getName()))
                    .findFirst()
                    .orElse(null);
            System.out.println("Placement: " + participant.getAttributes().getStats().getWinPlace());
        }
    }
}
