package com.example.core.services.storage;

import com.example.core.domain.GameResult;

import java.util.List;

/**
 * Created by Vladislav on 3/25/2016.
 */
public interface GameSessionDataStorage {
    List<GameResult> getAll();
    GameResult getByLogin(String login);
    void deleteByLogin(String login);
    void addResult(GameResult result);
    void updatePlayerScore(GameResult result);
    Integer getMinScore();
}
