package daodemo;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudentID(int id);
    public void deleteStudent(Student student);
    public void updateStudent(Student student);
}
