// 데일리 알고 39: 팰린드롬 판별하기

class Solution {
    public boolean solution(String word) {
        char[] wordChar = word.toCharArray();

        for (int i = 0; i < word.length() / 2; i++) {
            if (wordChar[i] != wordChar[word.length() - i -1]) return false;
        }

        return true;

        // // 강사님 풀이 1 - StringBuilder 사용
        // StringBuilder sb = new StringBuilder(word);
        // String reversedWord = sb.reverse().toString();
        // return word.equals(reversedWord);


        // // 강사님 풀이 2 - 투 포인터
        // boolean isPal = true;
        // int left = 0;
        // int right = word.length() -1;

        // while (left < right) {
        //     if (word.charAt(left) != word.charAt(right)) {
        //         isPal = false;
        //         break;
        //     }
        //     left++; right--;
        // }

        // return isPal;
    }
}