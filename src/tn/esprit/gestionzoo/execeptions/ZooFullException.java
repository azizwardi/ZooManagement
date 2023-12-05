package tn.esprit.gestionzoo.execeptions;

public class ZooFullException extends RuntimeException {
    public ZooFullException(String message) {
        super(message);
    }
}