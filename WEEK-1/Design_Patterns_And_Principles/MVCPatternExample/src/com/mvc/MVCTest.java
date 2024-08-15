package com.mvc;

public class MVCTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        Student student = new Student("SAI CHARAN", "529", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("SAI CHARAN TEJA");
        controller.setStudentId("21501A0529");
        controller.setStudentGrade("B");
=======
        // Create a Student model
        Student student = new Student("John Doe", "S12345", "A");

        // Create a StudentView
        StudentView view = new StudentView();

        // Create a StudentController
        StudentController controller = new StudentController(student, view);

        // Update view
        controller.updateView();

        // Change student details
        controller.setStudentName("SAI CHARAN TEJA");
        controller.setStudentId("21501A0529");
        controller.setStudentGrade("B");

        // Update view with new details
      
>>>>>>> a40c4ee (WEEK 1 5007942)
        controller.updateView();
    }
}
