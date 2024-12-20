package org.example.streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // 다음 자료구조를 바탕으로 문제를 푸시오.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 필터링하여 리스트 반환
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);    // [2, 4, 6, 8, 10]

        // 모든 숫자에 2를 곱하여 리스트 반환
        List<Integer> doubleNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubleNumbers);  // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // 숫자들의 합계 계산
        int sumNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumNumbers);     // 55

        // 5보다 큰 숫자의 개수 계산
        long over5Num = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(over5Num);   // 5


        // 다음 자료구조를 바탕으로 문제를 푸시오.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "fineapple", "apple");

        // 길이가 5이상인 단어들만 필터링하여 리스트 반환
        List<String> longer5Words = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(longer5Words);   // [apple, banana, cherry, fineapple, apple]

        // 모든 단어들을 대문자로 변환하여 리스트 반환
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperWords);     // [APPLE, BANANA, CHERRY, FINEAPPLE, APPLE]

        // 중복된 단어 제거하고 알파벳 순 정렬하여 리스트 반환
        List<String> uniqueSorted = words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(uniqueSorted);   // [apple, banana, cherry, fineapple]

        // 각 단어의 길이를 리스트로 변환
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths);    // [5, 6, 6, 9, 5]


        // 다음 자료구조를 바탕으로 문제를 푸시오.
        List<Product> products = Arrays.asList(
                new Product("notebook", 1200000, "SALE"),
                new Product("mouse", 50000, "SALE"),
                new Product("keyboard", 150000, "SOLD_OUT"),
                new Product("monitor", 350000, "SOLD_OUT"),
                new Product("speaker", 400000, "SALE")
        );

        // 상품들의 이름 리스트 반환
        List<String> productNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(productNames);   // [notebook, mouse, keyboard, monitor, speaker]

        // 20만원 이상인 상품들의 이름 리스트 반환
        List<String> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() >= 200000)
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(expensiveProducts);  // [notebook, monitor, speaker]

        // 판매중인 상품의 가격 합
        int priceSum = products.stream()
                .filter(p -> p.getStatus().equals("SALE"))
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(priceSum);       // 1650000

        // 판매 중이면서 20만원 이상인 상품들의 이름 리스트 반환
        List<String> saleExpensiveProducts = products.stream()
                .filter(p -> p.getStatus().equals("SALE"))
                .filter(p -> p.getPrice() >= 200000)
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(saleExpensiveProducts);  // [notebook, speaker]
    }
}
