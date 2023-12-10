package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Aquatic aquatic) {
            return getName().equals(aquatic.getName()) && getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
        }
        return false;
    }

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println("Aquatic is eating meat");
        } else {
            System.out.println("Aquatic does not eat meat");
        }
    }
}
