package com.example.core.services;

import com.example.core.domain.GameResult;

/**
 * Created by Vladislav on 3/25/2016.
 */
public interface ResultValidationService {
    boolean shouldBeAdded(GameResult result);
}
