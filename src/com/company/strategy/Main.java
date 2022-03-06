package com.company.strategy;

import com.company.strategy.cook.CookEggs;
import com.company.strategy.cook.CookSoup;

/**
Po co uzywamy:
        + stosowanie roznych algorytmow metody danego obiektu
        + Strategia pozwala odizolować logikę biznesową klasy od szczegółów implementacyjnych algorytmów,
          które nie są istotne w kontekście tej logiki.
        + Stosuj ten wzorzec gdy twoja klasa zawiera duży operator warunkowy,
          którego zadaniem jest wybór odpowiedniego wariantu tego samego algorytmu.
        - Klienci kontekstu muszą skojarzyć go ze stosowną strategią,
          która odpowiada sposobowi w jaki kontekst ma wykonać swoje zadanie.

*/

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Marcin");

        chef.setCookStrategy(new CookEggs());

        chef.cook();

        chef.setCookStrategy(new CookSoup());

        chef.cook();

    }
}
