package org.example.service;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.model.Student;

public class studentRegistration {

    private ArrayList<Student> studentsList = new ArrayList<>();
    private Scanner jungkook = new Scanner (System.in);

    public void saveStudent (Student student){
        studentsList.add(student);
    }

    public void displayAllStudent(){
        System.out.println(studentsList);
    }

    public void updateStudent(Student student){
        for (int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getStudentID() == student.getStudentID()) {
                System.out.print("Enter new student name: ");
                String newName = jungkook.nextLine();
                System.out.print("Enter new program: ");
                String newProg = jungkook.nextLine();

                studentsList.set(i, new Student(student.getStudentID(), newName, newProg));
                break;
            }
        }
//        return "Error";
    }

    public String removeStudent(Student student){
        for (int i = 0; i<studentsList.size(); i++){
            if (studentsList.get(i).getStudentID() == student.getStudentID()){
                studentsList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }

}
