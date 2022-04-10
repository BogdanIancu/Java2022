package ro.ase.java;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private int speed;

    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed);
    }

    @Override
    public int compareTo(Car o) {
        if(speed < o.speed) {
            return -1;
        } else if (speed > o.speed) {
            return 1;
        } else {
            return 0;
        }
    }
}

