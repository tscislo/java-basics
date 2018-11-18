package eu.mobilenext.scislo;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    public int compare(Animal a, Animal b) {
        if (a.equals(b)) {
            return 0;
        } else if (a.bornDate.before(b.bornDate)) {
            return -1;
        } else {
            return 1;
        }

    }

}
