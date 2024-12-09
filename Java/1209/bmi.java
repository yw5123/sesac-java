// 데일리 알고 비만도 계산하기

class Solution {
    public String solution(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) return "저체중";
        else if (bmi < 23) return "정상";
        else if (bmi < 25) return "과체중";
        else return "비만";
    }
}