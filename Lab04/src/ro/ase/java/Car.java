package ro.ase.java;

public class Car {
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
}
