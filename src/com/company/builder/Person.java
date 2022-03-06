/* Po co uzywamy:
    + tworzenie danego obiektu klasy jest czytelniejsze
    + odizolowanie logiki biznesowej od kodu konstrukcyjnego
    + tworzenie zlozonych obiektow etapami
    + wieloktorne wykoszystanie kodu konstrukcyjnego
    - skaplikowanie klasy przez wieksza ilosc dodatkowych linijek
*/



package com.company.builder;

public class Person {

    private String fName;
    private String lName;
    private int age;

    private Person(String fName) {
        this.fName = fName;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class PersonBuilder {
        private String fName;
        private String lName;
        private int age;

        private PersonBuilder(String fName) {
            this.fName = fName;
        }

        public static PersonBuilder aPerson(String fName) {
            return new PersonBuilder(fName);
        }

        public PersonBuilder withLName(String lName) {
            this.lName = lName;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person(fName);
            person.setLName(lName);
            person.setAge(age);
            return person;
        }
    }
}
