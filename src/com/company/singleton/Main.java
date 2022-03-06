package com.company.singleton;

/** Po co uzywamy:
        + aby miec pewnosc ze jest jedna instncja danej klasy o globalnym zasiegu
        + ograniczenie tworzenia nieskonczonej ilosci obiektow danej klasy do jednej instancji
        - trudnosc w testowaniu i usuwaniu bledow
        - instancja potencjalnie jest niebzezpieczna wielowatkowo
*/

public class Main {
    public static void main(String[] args) {
        GameEngine gameEngine = GameEngine.getInstance();
        System.out.println(gameEngine.toString());
    }
}
