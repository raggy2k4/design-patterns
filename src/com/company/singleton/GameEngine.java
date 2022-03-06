/* Po co uzywamy:
        + aby miec pewnosc ze jest jedna instncja danej klasy o globalnym zasiegu
        + ograniczenie tworzenia nieskonczonej ilosci obiektow danej klasy do jednej instancji
        - trudnosc w testowaniu i usuwaniu bledow
        - instancja potencjalnie jest niebzezpieczna wielowatkowo
*/

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
