package daodemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    List<Student> students;

    public StudentDAOImpl() {
         students = new ArrayList<>();
         Student s1 = new Student("Rakib", 0);
         Student s2 = new Student("Alamain", 1);
         students.add(s1);
         students.add(s2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentID(int id) {
      return students.get(id);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println("Student: ID NO "+student.getId()+"Dleted from databse");
    }

    @Override
    public void updateStudent(Student student) {
       students.get(student.getId()).setName(student.getName());
        System.out.println("Student: ID No "+student.getId()+"Updated from database");
    }
}
