package org.example.compositionprac;

public class Pencil implements Writable, Tool {
    String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write(String text) {
        System.out.println(text + " - " + color + "색 연필로 씀");
    }

    @Override
    public void use() {
        write("글씨를 쓴다.");   // 강사님은 write()를 텍스트를 받지 않고 출력되게 구현하심
    }
}
