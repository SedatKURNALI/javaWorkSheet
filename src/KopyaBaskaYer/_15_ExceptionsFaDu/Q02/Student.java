package KopyaBaskaYer._15_ExceptionsFaDu.Q02;



import java.util.ArrayList;
import java.util.List;

public class Student {

    // 1 - variables

    String name;
    String surname;
    double age;

    public static List<Student> studentsOfSchool = new ArrayList<>();


    // 2 - Constructors

    public Student() {

    }

    public Student(String name, String surname, double age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // 3- Getter Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    // 4- toString


    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +"\n";
    }
}
