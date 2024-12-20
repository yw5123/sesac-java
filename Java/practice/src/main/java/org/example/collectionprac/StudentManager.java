package org.example.collectionprac;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> addStudent(Student student) {
        studentList.add(student);

        return studentList;
    }

    public void showStudentsInfo() {
        for (Student student : studentList) {
            student.showInfo();
            System.out.println();
        }
    }

    public Student findStudentByName(String name) {
        for (Student student : studentList) {
            if (student.name == name) {
                return student;
            }
        }
        System.out.println("이름이 " + name + "인 학생이 없습니다.");
        return null;
    }

}
