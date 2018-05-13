package me.adeane6.samples;

import me.adeane6.PUBGApi;
import me.adeane6.model.ApiStatus;
import me.adeane6.model.Shard;
import me.adeane6.model.match.MatchWrapper;
import me.adeane6.model.participant.Participant;
import me.adeane6.model.player.Player;


public class ClientSample {


    public static void main(String[] args) {
        PUBGApi pubgApi = new PUBGApi("<API_KEY>");

        ApiStatus status = pubgApi.status();
        System.out.println("API Status: " + status);

        Player player = pubgApi.getPlayersByNames(Shard.PC_NA, "shroud").getData().get(0);
        System.out.println("shroud ID: " + player.getId());

        Player playerById = pubgApi.getPlayersByIds(Shard.PC_NA, player.getId()).getData().get(0);
        System.out.println(player.getId() + " NAME: " + playerById.getAttributes().getName());

        for (String matchId : player.getMatchsIds()) {
            System.out.println("Match: " + matchId);
            MatchWrapper matchWrapper = pubgApi.getMatch(Shard.PC_NA, matchId);
            Participant participant = matchWrapper.getParticipants().stream()
                    .filter(p ->  p.getAttributes().getStats().getName()
                            .equals(player.getAttributes().getName()))
                    .findFirst()
                    .orElse(null);
            System.out.println("Placement: " + participant.getAttributes().getStats().getWinPlace());
        }
    }
}
