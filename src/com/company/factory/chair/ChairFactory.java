/* Po co uzywamy:

        + aby tworzyc gotowe obiekty
        + fabryka abstrakcyjna jest po to by tworzyc rozne typy obiektow implementujace ten sam interface
        + spelnia zasady solid, jest latwiejsza do pozniejszej modyfikacji
        + hermetyzacja procesu tworzenia obiektu
        + usuniecie zaleznosci miedzy implementacja obiektu a jego zastosowaniem
        - kod jest bardziej skaplikowany ze wgledu na wiekszosc ilosc klas i interface'ow;

*/

package com.company.factory.chair;

public class ChairFactory {
    private static ChairFactory chairFactoryInstance;

    private ChairFactory() {
    }

    public static ChairFactory getInstance() {
        if (chairFactoryInstance == null) {
            chairFactoryInstance = new ChairFactory();
        }
        return chairFactoryInstance;
    }

    public Armchair getArmchair(ChairFactoryEnum chairFactoryEnum) {
        switch (chairFactoryEnum) {
            case VINTAGE_CHAIR: {
                return new VintageChair();
            }
            case MODERN_CHAIR: {
                return new ModernChair();
            }
            default: {
                return null;
            }
        }
    }
}