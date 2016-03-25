package com.example.core.domain;

/**
 * Created by Vladislav on 3/25/2016.
 */
public class GameResult{
    private Player player;
    private Integer score;

    public GameResult(Player player, int score) {
        this.player = new Player(player);
        this.score = score;
    }

    public Player getPlayer() {
        return new Player(player);
    }

    public Integer getScore() {
        return score;
    }
}
