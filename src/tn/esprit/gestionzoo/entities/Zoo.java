package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    public static final int NUMBER_OF_AQUATICS = 10;
    int nbrAquatics = 0;
    Aquatic[] aquaticAnimals;
    private int nbrAnimals;
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[NUMBER_OF_AQUATICS];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals){
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }


    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }
    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public boolean isZooFull(){
        return nbrAnimals >= nbrCages;

    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        }
        return z1;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages + " N° animals: " + nbrAnimals;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < NUMBER_OF_AQUATICS) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
           // System.out.println("aquatics : " + nbrAquatics);
        } else {
            System.out.println("Complet !");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxSwimmingDepth = -1;
        for (int i = 0; i < nbrAquatics; i++) {
            if ((aquaticAnimals[i] instanceof Penguin) && (((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxSwimmingDepth)) {
                maxSwimmingDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return maxSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;

        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            } else if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
        }

        System.out.println("Le nombre des dophins = " + nbrDolphins);
        System.out.println("Le nombre des penguins = " + nbrPenguins);
    }


}