package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal("nothing", "Sisi", 100, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Zoo myZoo = new Zoo("mimi", "bizerte");


        System.out.println(myZoo);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        System.out.println(myZoo.searchAnimal(dog));

        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        myZoo.displayAnimals();

        System.out.println(myZoo.removeAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.isZooFull());

        Zoo myZoo2 = new Zoo("mimi", "bizerte");

        Zoo compared = myZoo2.comparerZoo(myZoo2,myZoo);
        System.out.println("the biggest zoo is " + compared.getName());


        System.out.println("-------------------------------------------------------");
        Aquatic aquatic1 = new Aquatic("Fish", "Goldie", 2, true, "Ocean");
        Terrestrial terrestrial1 = new Terrestrial("Kangaroo", "Joey", 4, true, 2);
        Dolphin dolphin1 = new Dolphin("Delphinidae", "Finn", 5, true, "Sea", 12.2f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Waddle", 3, true, "Ocean", 21.7f);

        System.out.println(aquatic1);
        System.out.println(terrestrial1);
        System.out.println(dolphin1);
        System.out.println(penguin1);

        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();

    }
}
