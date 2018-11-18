package eu.mobilenext.scislo;

import javax.swing.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Animal implements Comparable<Animal> {

    protected String name;
    protected AnimalTypes type;
    protected Date bornDate;
    public int distance = 0;
    protected Timer timer;

    public Animal(String name, AnimalTypes type, int year, int month, int day) {
        this.name = name;
        this.type = type;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.bornDate = calendar.getTime();
    }


    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false if the explicit parameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) return false;

        Animal otherAnimal = (Animal) otherObject;

        return otherAnimal.name.equals(name) && otherAnimal.type.equals(type) && otherAnimal.bornDate.equals(bornDate);

        // Alternatywa poprzez hashCode
        // return hashCode() == otherObject.hashCode();

    }

    public int hashCode() {
        return Objects.hash(name, type, bornDate);
    }

    public String toString() {
        return getClass().getName() + "[name = " + name + ",type = " + type + ",bornDate = " + bornDate
                + ", distance" + distance + "]";
    }

    public int compareTo(Animal other) {
        if (this.bornDate.after(other.bornDate)) {
            return 1;
        } else if (this.bornDate.before(other.bornDate)) {
            return -1;
        } else {
            return 0;
        }
    }

    public Animal clone() throws CloneNotSupportedException {
        // call Object.clone()
        Animal cloned = (Animal) super.clone();

        // clone mutable fields
        cloned.bornDate = (Date) bornDate.clone();

        return cloned;
    }

    public void run(int speed) {
        int interval = 1000;
        timer = new Timer(interval, (e) -> {
            int distance = speed;
            this.distance += distance;
        });
        timer.start();
    }

    public void stop() {
        if (timer.isRunning()) {
            timer.stop();
        }
    }

}
