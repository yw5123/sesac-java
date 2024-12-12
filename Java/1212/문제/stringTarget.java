// 데일리 알고 40: 부분 문자열 개수 세기 - 코드 리뷰

class Solution {
    public int solution(String word, String target) {
        int answer = 0;

        // for (int i = 0; i <= word.length() - target.length(); i++) {
        //     String subWord = word.substring(i, i + target.length());
        //     if (subWord.equals(target)) answer++;
        // }

        for (int i = 0; i <= word.length() - target.length(); i++) {
            boolean isSame = true;

            for (int j = 0; j < target.length(); j++) {
                if (word.charAt(i + j) != target.charAt(j)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) answer++;
        }

        return answer;
    }
}