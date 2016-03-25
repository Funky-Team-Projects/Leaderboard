package com.example.core.services.storage;

import com.example.core.domain.GameResult;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Vladislav on 3/25/2016.
 */
@Component
public class GameSessionDataStorageImpl implements GameSessionDataStorage {

    private final int MAX_GAME_RESULTS = 12;
    private HashMap<String, GameResult>  data;

    public GameSessionDataStorageImpl() {
        data = new HashMap<>();
    }

    @Override
    public List<GameResult> getAll() {
        return new ArrayList<GameResult>(data.values());
    }

    @Override
    public GameResult getByLogin(String login) {
        return getGameResult(login);
    }

    @Override
    public void deleteByLogin(String login) {
        removeGameResult(login);
    }

    @Override
    public void addResult(GameResult result) {
        if (queueIsFull()) addIfNeeded(result);
        else putGameResult(result);
    }

    @Override
    public void updatePlayerScore(GameResult result) {
        if (data.containsKey(result.getPlayer().getName().toUpperCase())) putGameResult(result);
        else throw new IllegalArgumentException("Player with this name is not present");
    }

    @Override
    public Integer getMinScore() {
        return getMinEntry().getValue().getScore();
    }

    /* Private helper methods */
    private void addIfNeeded(GameResult result) {
        Map.Entry<String, GameResult> minEntry = getMinEntry();
        if (hasBetterScore(result, minEntry.getValue())){
            removeGameResult(minEntry.getKey());
            putGameResult(result);
        }
    }

    private boolean hasBetterScore(GameResult result1, GameResult result2) {
        return result1.getScore()<result2.getScore();
    }

    private Map.Entry<String, GameResult> getMinEntry() {
        return data.entrySet().stream()
                .min((o1, o2) -> o1.getValue().getScore().compareTo(o2.getValue().getScore()))
                .get();
    }

    private boolean queueIsFull() {
        return data.size()==MAX_GAME_RESULTS;
    }

    private void putGameResult(GameResult result) {
        data.put(result.getPlayer().getName().toUpperCase(), result);
    }

    private GameResult getGameResult(String login) {
        return data.get(login.toUpperCase());
    }

    private void removeGameResult(String login) {
        data.remove(login.toUpperCase());
    }


}
