package Association;

import java.util.ArrayList;
import java.util.List;

class College {

     String name;
    List<Teacher> teacher;

    public College(String name, List<Teacher> teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }
}
class Teacher{

    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
class AggregationDemo{
    public static void main(String[] args) {
        List<Teacher> teachers=new ArrayList<Teacher>();
        teachers.add(new Teacher("john","Maths"));
        teachers.add(new Teacher("carl","English"));

        College college=new College("KNB",teachers);
        System.out.println(college.teacher.toString());
    }
}