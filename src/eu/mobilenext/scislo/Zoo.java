package eu.mobilenext.scislo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {
        Animal mruczek = new Animal("Mruczek", AnimalTypes.MAMMAL, 2016, 1, 1);
        Animal bonifacy = new Animal("Bonifacy", AnimalTypes.MAMMAL, 2015, 1, 1);
        Animal lion = new Animal("Lew", AnimalTypes.MAMMAL, 2015, 10, 10);
        Dog azor = new Dog("Azor", DogStatusTypes.MUTT, 2020, 1, 1);
        Dog azor2 = new Dog("Azor", DogStatusTypes.MUTT, 2020, 1, 1);

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(mruczek);
        zoo.add(bonifacy);
        zoo.add(lion);
        zoo.add(azor);
        zoo.add(azor2);

        Zoo.print(zoo);

        System.out.println("mruczek.equals(azor) " + mruczek.equals(azor));
        System.out.println("azor.equals(azor2) " + azor.equals(azor2));
//
//        zoo.sort(new AnimalComparator());

//        Zoo.print(zoo);
//
//        Animal[] zooWarszawa = {mruczek, bonifacy, lion, azor, azor2};
//
//        Arrays.sort(zooWarszawa);
//
//        Zoo.printArr(zooWarszawa);

//
//        try {
//            Dog fafikClone = fafik.clone();
//            System.out.println(fafik);
//            fafik.setBornYear(100);
//            System.out.println(fafik);
//            System.out.println(fafikClone);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

//        Dog fafik = new Dog("Fafik", DogStatusTypes.MUTT, 2020, 1, 1);
//        Dog azor = new Dog("Azor", DogStatusTypes.MUTT, 2020, 1, 1);
//        Dog burek = new Dog("Burek", DogStatusTypes.MUTT, 2020, 1, 1);
//
//        fafik.run(100);
//        azor.run(300);
//        burek.run(200);
//
//        try {
//            Thread.sleep(11000);
//        } catch (InterruptedException e) {
//
//        }
//        fafik.stop();
//        azor.stop();
//        burek.stop();
//        System.out.println(fafik);
//        System.out.printf("%d m\n", fafik.distance);
//        System.out.println(azor);
//        System.out.printf("%d m\n", azor.distance);
//        System.out.println(burek);
//        System.out.printf("%d m\n", burek.distance);


//        JOptionPane.showMessageDialog(null, "Bieg psów!");
//        System.exit(0);

    }

    public static <Animal> void print(ArrayList<Animal> zoo) {
        printArr(zoo.toArray());
    }

    public static <T> void printArr(T[] zoo) {
        System.out.println("\n\n");
        for (T a : zoo) {
            System.out.println(a);
        }
    }

}
