package ro.ase.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("Dacia Logan", 100);
        Car c2 = new Car("Ford Puma", 90);

        Set<Car> set = new HashSet<Car>();
        set.add(c1);
        set.add(c2);

        Car c3 = new Car("Dacia Logan", 100);
        set.add(c3);

        for(Car c : set) {
            System.out.println(c);
        }

        set = new TreeSet<>();
        set.add(c1);
        set.add(c2);

        for(Iterator<Car> it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        Map<String, Car> map = new HashMap<>();
        map.put("Dacia", c1);
        map.put("Ford", c2);
        map.put("Dacia", c3);

        System.out.println(map.size());

        System.out.println(map.get("Dacia"));

        for(String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }

        int x = 10;
        int y = 7;
        swap(x, y);
        System.out.println("x = " + x + ", y = " + y);

        Number n1 = new Number();
        n1.value = 10;
        Number n2 = new Number();
        n2.value = 7;
        swap(n1, n2);
        System.out.println("n1 = " + n1.value + ", n2 = " + n2.value);

        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }

    static void swap(int x, int y) {
        int aux = x;
        x = y;
        y = aux;
    }

    static void swap(Number x, Number y) {
//        x = new Number();
//        x.value = 10;
//        y = new Number();
//        y.value = 7;
        int aux = x.value;
        x.value = y.value;
        y.value = aux;
    }

    static long sum(int... values) {
        long sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

class Number {
    public int value;
}
