package com.company.builder;

/** Po co uzywamy:
    + tworzenie danego obiektu klasy jest czytelniejsze
    + odizolowanie logiki biznesowej od kodu konstrukcyjnego
    + tworzenie zlozonych obiektow etapami
    + wieloktorne wykoszystanie kodu konstrukcyjnego
    - skaplikowanie klasy przez wieksza ilosc dodatkowych linijek
*/

public class Main {
    public static void main(String[] args) {
      Person person = Person.PersonBuilder
              .aPerson("Marcin")
              .withLName("Kowalski")
              .withAge(18)
              .build();

        System.out.println(person.getAge());
    }
}
