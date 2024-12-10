// 데일리 알고: 쇼핑몰 가격 계산하기 - 코드 리뷰

class Solution {
    public int solution(int totalPrice, String membership, String paymentMethod) {
        double result = (double)totalPrice;

        if (result >= 500000) {
            result = totalPrice * (1 - 0.15);
        } else if (result >= 300000) {
            result = totalPrice * (1 - 0.10);
        } else if (result >= 100000) {
            result = totalPrice * (1 - 0.05);
        }

        switch(membership) {
            case "실버":
                result = result * (1 - 0.03);
                break;
            case "골드":
                result = result * (1 - 0.05);
                break;
            case "플래티넘":
                result = result * (1 - 0.10);
                break;
        }

        if (paymentMethod.equals("현금")) {
            result = result * ( 1 - 0.02);
        }

        if (totalPrice >= 500000 && membership.equals("플래티넘") && paymentMethod.equals(("현금"))) {
            result -= 50000;
        }

        return (int)result;
    }
}