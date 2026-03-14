package org.example.service;
import java.util.Scanner;
import java.util.ArrayList;
import org.example.model.Course;

public class courseRegistration {
    private Scanner jungkook = new Scanner(System.in);
    private ArrayList<Course> coursesList = new ArrayList<>();

    public void save (Course course){
        coursesList.add(course);
        System.out.println("Successfully added!");
    }

    public void displayAll (){
        System.out.println(coursesList);
    }

    public void updateCourse (Course course){
        for (int i=0; i < coursesList.size(); i++){
            if (coursesList.get(i).() == (course.getID())){
                System.out.print("Enter new course: ");
                String newName = jungkook.nextLine();
                System.out.print("Enter new program: ");
                String newProg = jungkook.nextLine();

                coursesList.set(i, new Course (course.getID(), newName, newProg));
                System.out.println("Successfully updated!");
                break;
            }
        }
    }

    public String removeCourse(Course course) {
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getID() == (course.getID())) {
                coursesList.remove(i);
                return "Successfully deleted!";
            }
        }
        return "Error";
    }
}
