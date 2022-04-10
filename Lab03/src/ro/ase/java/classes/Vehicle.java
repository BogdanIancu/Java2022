package ro.ase.java.classes;

public abstract class Vehicle implements Cloneable {
    private String producer;
    protected float speed;

    public Vehicle() {
        this("", 0);
    }

    public Vehicle(String producer, float speed) {
        if(producer != null) {
            this.producer = producer;
        }
        this.speed = speed;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Vehicle copy = (Vehicle)super.clone();
        copy.producer = producer;
        copy.speed = speed;
        return copy;
    }

    public abstract void start();
}
