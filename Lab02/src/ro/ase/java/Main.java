package ro.ase.java;

import ro.ase.java.classes.Student;
import ro.ase.java.classes.Tuition;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Student s1 = new Student();
        System.out.println(s1.getName());

        Student s2 = new Student("John", 21);
        System.out.println(s2.getAge());
        s2.tuition = Tuition.BUDGET;
        System.out.println(s2.tuition);

        Student s3 = (Student)s2.clone();

        int[] vector = new int[3];
        vector[0] = 99;
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        for(int x : vector) {
            System.out.println(x);
        }

        float[][] matrix = new float[2][3];
        matrix[0][0] = 2.5f;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[1] = new int[1];
        raggedArray[2] = new int[3];

        float[] scores = new float[] { 9.5f, 8, 4 };

        Student s4 = new Student("George", 22, Tuition.TAX, scores);
        scores[0] = 1;
    }
}
