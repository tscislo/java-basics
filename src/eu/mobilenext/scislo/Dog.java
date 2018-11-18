package eu.mobilenext.scislo;

import java.util.Objects;

public class Dog extends Animal implements Cloneable {

    public DogStatusTypes status;

    public Dog(String name, DogStatusTypes type, int year, int month, int day) {
        super(name, AnimalTypes.MAMMAL, year, month, day);
        status = type;
    }

    public int hashCode() {
        return super.hashCode() + Objects.hash(status);
    }

    public String toString() {
        return super.toString() + " [ status = " + status + " ]";
    }

    public void setBornYear(int year) {
        this.bornDate.setYear(year);
    }

    public Dog clone() throws CloneNotSupportedException {
        Dog cloned = (Dog) super.clone();

        return cloned;
    }


}
