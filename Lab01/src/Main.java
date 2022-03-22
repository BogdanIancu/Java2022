public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Student s1 = new Student();
        System.out.println(s1.name);

        Student s2 = new Student("John", 9);
        System.out.println(s2.name);

        //shallow copy
        Student s3 = s2;
        s3.name = "George";
        System.out.println(s2.name);

        //deep copies
        Student s4 = s1.myClone();
        Student s5 = (Student)s1.clone();
    }
}
