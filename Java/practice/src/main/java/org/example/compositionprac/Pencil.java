package org.example.compositionprac;

public class Pencil implements Writable {
    String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write(String text) {
        System.out.println(text + " - " + color + "색 연필로 씀");
    }
}
