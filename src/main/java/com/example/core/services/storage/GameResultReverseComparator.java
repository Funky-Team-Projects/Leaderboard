package com.example.core.services.storage;

import com.example.core.domain.GameResult;

import java.util.Comparator;

/**
 * Created by Vladislav on 3/25/2016.
 */
public class GameResultReverseComparator implements Comparator<GameResult> {
    @Override
    public int compare(GameResult o1, GameResult o2) {
        if (o1.getScore()>o2.getScore()) return -1;
        if (o1.getScore()<o2.getScore()) return 1;
        return 0;
    }
}
