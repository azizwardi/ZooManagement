import java.util.Scanner;

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
        System.out.println("the biggest zoo is " + compared.name);
    }
}
