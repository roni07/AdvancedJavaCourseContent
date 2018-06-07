package daodemo;

public class DAODemo {

    public static void main(String[] args) {
    
    StudentDAO studentdao = new StudentDAOImpl();
    
    
    //print all students
    for (Student student : studentdao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getId() + ", Name : " + student.getName() + " ]");
      }
    
    //update student
    
    Student student = studentdao.getAllStudents().get(0);
    student.setName("Roni");
    studentdao.updateStudent(student);
    
    // get the student
    
    studentdao.getStudentID(0);
        System.out.println("Student: [RollNo : " + student.getId() + ", Name : " + student.getName() + " ]");
    
    }
    
}
