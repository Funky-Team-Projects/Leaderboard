package com.example.core.services;

import com.example.core.domain.GameResult;

/**
 * Created by Vladislav on 3/25/2016.
 */
public interface ResultPersistenceService {
    void deketeByLogin(String login);
    void add(GameResult result);
}
