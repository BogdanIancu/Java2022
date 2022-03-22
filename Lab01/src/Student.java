public class Student {
    public String name;
    private float grade;

    public Student() {
        name = "Anonymous";
        grade = 1;
    }

    public Student(String _name, float grade) {
        name = _name;
        this.grade = grade;
    }

    public Student myClone() {
        Student copy = new Student();
        copy.name = name;
        copy.grade = grade;
        return copy;
    }

    @Override
    protected Object clone() {
        Student copy = new Student();
        copy.name = name;
        copy.grade = grade;
        return copy;
    }
}
