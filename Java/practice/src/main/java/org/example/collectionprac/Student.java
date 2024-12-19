package org.example.collectionprac;

import java.util.HashMap;

public class Student {
    String name;
    int age;
    HashMap<String, Integer> grades = new HashMap<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saveGrade(String subject, int grade) {
        grades.put(subject, grade);
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
