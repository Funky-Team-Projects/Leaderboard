package com.example.core.services;

import com.example.core.domain.GameResult;
import com.example.core.domain.Player;

import java.util.List;

/**
 * Created by Vladislav on 3/25/2016.
 */
public interface Leaderboard {
    void addGameResult(GameResult result);
    List<GameResult> getTopGameResults();
    void deletePlayer(String login);
}
