package org.example.service;
import java.util.Scanner;
import java.util.ArrayList;
import org.example.model.Course;

public class courseRegistration {
    private Scanner jungkook = new Scanner(System.in);
    private ArrayList<Course> coursesList = new ArrayList<>();

    public void save (Course course){
        coursesList.add(course);
    }

    public void displayAll (){
        System.out.println(coursesList);
    }

    public void updateCourse (Course course){
        for (int i=0; i < coursesList.size(); i++){
            if (coursesList.get(i).getCourseID() == course.getCourseID()){
                System.out.print("Enter new course: ");
                String newName = jungkook.nextLine();
                System.out.print("Enter new program: ");
                String newProg = jungkook.nextLine();

                coursesList.set(i, new Course (course.getCourseID(), newName, newProg));
                break;
            }
        }
    }

    public String removeCourse(Course course) {
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCourseID() == course.getCourseID()) {
                coursesList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
