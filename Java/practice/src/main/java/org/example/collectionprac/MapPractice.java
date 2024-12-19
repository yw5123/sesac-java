package org.example.collectionprac;

import java.util.HashMap;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("korean", 100);
        map.put("english", 10);
        System.out.println(map);    // {english=10, korean=100}

        map.put("korean", 30);
        System.out.println(map);    // {english=10, korean=30}

        // 조회
        System.out.println(map.get("korean"));  // 30
        System.out.println(map.get("math"));    // null

        System.out.println(map.getOrDefault("math", 0));    // 0
        System.out.println(map.getOrDefault("korean", 0));    // 30

        // 크기
        System.out.println(map.size());     // 2

        // 어떤 타입으로 할당해야할지 모르겠을 때 map.keySet() 적고 ctrl+alt+v 누르면 자동 완성됨
        Set<String> keys = map.keySet();
        // iter 입력하고 엔터 치면 for문 자동완성
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + value);
        }       // english10 / korean30

//            안녕하세요 제가 누구신지 아세요?ㅋㅋㅋ 핫초코는 어디서 나셨어요? 원래 다 없었는데..언제 꿍쳐두셨죠? 꿍쳐둔 거 딱 걸림 ㅋㅋ
            // ㄴ 악플 깃에 남겨두겠습니다;
    }
}
