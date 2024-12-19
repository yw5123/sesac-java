package org.example.collectionprac;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void findStudent(String name) {
        for (Student student : studentList) {
            if (student.name == name) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("이름이 " + name + "인 학생이 없습니다.");
    }

    public void showStudentsInfo() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
