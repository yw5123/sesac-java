// 데일리 알고 쇼핑몰 가격 계산하기

class Solution {
    public int solution(int totalPrice, String membership, String paymentMethod) {
        double result = (double) totalPrice;

        if (result >= 500000) {
            result *= 0.85;
        } else if (result >= 300000) {
            result *= 0.9;
        } else if (result >= 100000) {
            result *= 0.95;
        } 
        
        switch(membership) {
            case "실버":
                result *= 0.97;
                break;
            case "골드":
                result *= 0.95;
                break;
            case "플래티넘":
                result *= 0.9;
                break;
        }

        if (paymentMethod.equals("현금")) {
            result *= 0.98;
            if (totalPrice >= 500000 && membership.equals("플래티넘")) {
                result -= 50000;
            }
        }

        return (int)result;
    }
}