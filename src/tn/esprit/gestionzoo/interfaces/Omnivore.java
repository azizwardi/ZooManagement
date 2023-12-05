package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.interfaces.Herbivore;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);


}