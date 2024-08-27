package com.mvc;

public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("SAI CHARAN", "529", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("SAI CHARAN TEJA");
        controller.setStudentId("21501A0529");
        controller.setStudentGrade("B");
        // Create a Student model
        Student student1 = new Student("John Doe", "S12345", "A");

        // Create a StudentView
        StudentView view1 = new StudentView();

        // Create a StudentController
        StudentController controller1 = new StudentController(student1, view1);

        // Update view
        controller1.updateView();

        // Change student details
        controller1.setStudentName("SAI CHARAN TEJA");
        controller1.setStudentId("21501A0529");
        controller1.setStudentGrade("B");

        // Update view with new details
      
        controller1.updateView();
    }
}
