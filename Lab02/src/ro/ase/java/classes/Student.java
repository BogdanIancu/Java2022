package ro.ase.java.classes;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    public Tuition tuition;
    private float[] grades;

    public Student() {
        name = "Anonymous";
        age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Tuition tuition, float[] grades) {
        this.name = name;
        this.age = age;
        this.tuition = tuition;
        if(grades != null) {
            this.grades = new float[grades.length];
            for (int i = 0; i < grades.length; i++) {
                this.grades[i] = grades[i];
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getGrades() {
        if(grades != null) {
            return Arrays.copyOf(grades, grades.length);
        }
        return null;
    }

    public void setGrades(float[] grades) {
        if(grades != null) {
            this.grades = new float[grades.length];
            System.arraycopy(grades, 0, this.grades, 0, grades.length);
        }
    }

    @Override
    public Object clone() {
        Student copy = new Student();
        copy.name = name;
        copy.age = age;
        copy.tuition = tuition;
        copy.setGrades(grades);
        return copy;
    }
}
