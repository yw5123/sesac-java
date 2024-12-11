// 데일리 알고 33: 문자열에서 모음 개수 세기

class Solution {
    public int solution(String word) {
        int answer = 0;

        char[] vowels = {'a','e','i','o','u'};

        for (int i = 0; i < word.length(); i++) {
            for (char vowel : vowels) {
                if (word.charAt(i) == vowel) answer++;
            }
        }

        // 다른 분들 아이디어 보고 풀어본 방법들
        
        // // contains 사용
        // String vowel = "aeiou";

        // for (int i = 0; i < word.length(); i++) {
        //     if (vowel.contains(Character.toString(word.charAt(i)))) answer++;
        // }

        // // switch 사용
        // char[] wordChar = word.toCharArray();

        // for (char w : wordChar) {
        //     switch(w) {
        //         case 'a':
        //         case 'e':
        //         case 'i':
        //         case 'o':
        //         case 'u':
        //             answer++;
        //     }
        // }

        // // 강사님 풀이
        // char[] vowels = {'a','e','i','o','u'};
        // char[] charArray = word.toCharArray();

        // for (char c: charArray) {
        //     for (char vowel : vowels) {
        //         if (c == vowel) {
        //             answer++;
        //             break;
        //         }
        //     }
        // }

        // // 정규식 활용.. 대박
        // return word.replaceAll("[^aeiou]", "").length();

        return answer;
    }
}