package org.kata.tennis;

import java.util.Map;

public class TennisGame {

    int player1Score;
    int player2Score;

    Map<Integer, String> scoring = Map.of(
            0,"love",
            1, "fifteen",
            2, "thirty",
            3, "forty"
    );

    public String getScore() {
        String p1Score = scoring.get(player1Score);
        String p2Score = scoring.get(player2Score);

        if(player1Score == 3 && player2Score == 3)
            return "deuce";

        return p1Score + "-" + p2Score;
    }

    public void player1Scores() {
        player1Score++;
    }

    public void player2Scores() {
        player2Score++;
    }
}
