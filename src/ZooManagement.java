import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal("nothing", "Sisi", 100, true);
        Zoo myZoo = new Zoo("mimi", "ariana", 25);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        System.out.println(myZoo.searchAnimal(dog));

        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


    }
}
