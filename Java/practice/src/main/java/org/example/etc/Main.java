package org.example.etc;

public class Main {
    public static void main(String[] args) {
        GenericPrac<Integer> integerGenericPrac = new GenericPrac<>();
        integerGenericPrac.setValue(123);

        GenericPrac<String> stringGenericPrac = new GenericPrac<>();
        stringGenericPrac.setValue("123");

        // Enum(열거형)
        Day monday = Day.MONDAY;
    }
}
