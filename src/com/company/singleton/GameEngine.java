package com.company.singleton;

public class GameEngine {

    private static GameEngine gameEngineInstance;

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (gameEngineInstance == null) {
            gameEngineInstance = new GameEngine();
        }
        return gameEngineInstance;
    }

}
