# 데일리 알고 윤년 판별하기

class Solution {
    public String solution(int year) {
        if (year % 400 == 0) return "YES";
        else if (year % 100 == 0) return "NO";
        else if (year % 4 == 0) return "YES";
        else return "NO";
    }
}