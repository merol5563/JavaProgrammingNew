package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public  int age;
    public int stedentID;
    public  char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name,char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int stedentID) {
        this(name);
        this.stedentID = stedentID;
    }

    public Student(String name, int stedentID, char grade) {
        this(name, stedentID);
        this.stedentID = stedentID;
        this.grade = grade;
    }
    public Student(String name, char gender, int age) {
        this(name, gender);
        this.gender = gender;
        this.age = age;
    }

    public Student(String name, char gender, int age, int stedentID) {
        this(name, gender, age);
        this.stedentID = stedentID;
    }
    public Student(String name, char gender, int age, int stedentID, char grade) {
        this(name, gender, age, stedentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", stedentID=" + stedentID +
                ", grade=" + grade +
                '}';
    }
}
