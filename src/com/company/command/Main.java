/* Po co uzywamy:
    + zasada pojedynczej odpowiedzialnosci
    + pozwala implementowac cofnij ponow
    + mozna zlozyc zestaw z wielu prostych komend
    + Zasada pojedynczej odpowiedzialności. Można rozprzęgnąć klasy
      wywołujące polecenia od klas faktycznie je wykonujących.
    + Zasada otwarte/zamknięte. Można wprowadzić nowe polece-
      nia do aplikacji bez psucia istniejącego kodu klienta.
    + Pozwala zaimplementować cofnij/ponów.
    + Pozwala zaimplementować opóźnione wykonywanie działań.
    + Można złożyć zestaw prostszych poleceń w jedno skompliko- wane.
    - Kod może stać się bardziej skomplikowany gdyż wprowadzamy całą nową warstwę
      pomiędzy nadawcami a odbiorcami.
    - skaplikowanie klasy przez wieksza ilosc dodatkowych linijek
*/


package com.company.command;

import com.company.command.cmd.ShakerCleanCommand;
import com.company.command.cmd.ShakerTurnOffCommand;
import com.company.command.cmd.ShakerTurnOnCommand;

public class Main {
    public static void main(String[] args) {

        Shaker shaker = new Shaker();
        ShakerApp shakerApp = new ShakerApp();

        shakerApp.addCommand(new ShakerTurnOnCommand(shaker));
        shakerApp.addCommand(new ShakerTurnOffCommand(shaker));
        shakerApp.addCommand(new ShakerCleanCommand(shaker));

        shakerApp.run();

    }
}
