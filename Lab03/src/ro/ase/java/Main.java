package ro.ase.java;

import ro.ase.java.classes.Car;
import ro.ase.java.classes.Vehicle;
import ro.ase.java.interfaces.Taxable;

public class Main {

    public static void main(String[] args) {
        Taxable t = new Car("Ford", "Puma", 70, 900);
        Vehicle v = new Car("Dacia", "Logan", 50, 1200);

        float tax = t.computeTax();
        System.out.println("Tax: " + tax);
        v.start();

        if(v instanceof Cloneable) {
            try {
                System.out.println(v);
                Car copy = (Car)v.clone();
                System.out.println(copy);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
