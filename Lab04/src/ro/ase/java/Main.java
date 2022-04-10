package ro.ase.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);
        for(int x : list) {
            System.out.println(x);
        }

        Car c1 = new Car("Dacia Logan", 100);
        Car c2 = new Car("Tesla Model 3", 120);
        List<Car> vector = new Vector<>();
        vector.add(c1);
        vector.add(c2);

        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
