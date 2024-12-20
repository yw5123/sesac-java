package org.example.collectionprac;

import java.util.HashMap;
import java.util.Map;

public class Student {
    String name;
    int age;
    Map<String, Integer> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new HashMap<>();
    }

    // 과목&성적을 받는다 => grade에 추가한다 => 1. grade return / 2. void return
    public Map<String, Integer> saveGrade(String subject, Integer score) {
        grades.put(subject, score);

        return grades;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성적: " + grades);
    }

    public double getAverage() {
        int sum = 0;
        for (String key : grades.keySet()) {
            sum += grades.get(key);
        }

        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}';
    }
}
