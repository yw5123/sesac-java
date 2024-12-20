package org.example.collectionprac;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 30, 20, 10이 들어있는 ArrayList를 만들고, 합계와 평균을 계산하시오.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(20);
        nums.add(10);

        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }

        System.out.println("합계: " + sum);   // 합계: 60
        System.out.println("평균: " + sum / nums.size());     // 평균: 20


        // - 다음을 참고하여 학생 성적 관리 시스템을 구현하시오.
        //    - Student 클래스
        //        - 이름(String), 나이(int)
        //        - 과목별 성적 저장
        //        - 성적의 평균 계산
        //    - StudentManager 클래스
        //        - 학생들의 목록을 관리(가지고 있음)
        //        - 학생 추가, 검색
        //        - 학생들의 정보 조회

        Student beemo = new Student("beemo", 19);
        beemo.saveGrade("java", 60);
        beemo.saveGrade("python", 90);
        beemo.saveGrade("c++", 50);

        beemo.showInfo();   // 이름: beemo / 나이: 19 / 성적: {python=90, c++=50, java=60}
        System.out.println("평균 점수: " + beemo.getAverage());     // 평균 점수: 66.66666666666667

        Student lynda = new Student("lynda", 17);
        lynda.saveGrade("python", 100);
        lynda.saveGrade("java", 90);

        lynda.showInfo();   // 이름: lynda / 나이: 17 / 성적: {python=100, java=90}
        System.out.println("평균 점수: " + lynda.getAverage());     // 평균 점수: 95.0

        StudentManager manager = new StudentManager();
        manager.addStudent(beemo);
        manager.addStudent(lynda);

        manager.showStudentsInfo();
        // 이름: beemo / 나이: 19 / 성적: {python=90, c++=50, java=60}
        // 이름: lynda / 나이: 17 / 성적: {python=100, java=90}

        System.out.println(manager.findStudentByName("lynda")); // Student {name='lynda', age=17, grades={python=100, java=90}}
        System.out.println(manager.findStudentByName("jun"));   // 이름이 jun인 학생이 없습니다. / null
    }
}
