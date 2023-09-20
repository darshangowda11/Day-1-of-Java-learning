class Student {
    private int rollNumber;
    private String name;
    private int marks;

    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public String getDetails() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Naveen", 88);
        students[1] = new Student(2, "Hush", 67);
        students[2] = new Student(3, "Kitten", 97);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getDetails());
        }
    }
}
