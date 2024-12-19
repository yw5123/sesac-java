package org.example.compositionprac;

public class Person {
    String name;
    Pencil pencil;
    Pencil[] pencils;
    public Tool tool;

    public Person(String name, Pencil pencil) {
        this.name = name;
        this.pencil = pencil;
        this.tool = pencil;     // 확장 후 기존 코드에서 오류가 발생해서 추가
        // Pencil이 더 구체적인 타입이라 이 생성자로 생성됨
        // 주석 처리하면 확장 전 코드가 작동하지 않아서 이렇게 수정해둠
    }

    public Person(String name, Tool tool) {
        this.name = name;
        this.tool = tool;
    }

    public Person(String name, Pencil[] pencils) {
        this.name = name;
        this.pencils = pencils;
    }

    public void write(String text) {
        pencil.write(text);
    }

    public void writeMany(String text) {
        for (Pencil p : pencils) {
            p.write(text);
        }
    }

    public void use() {
        tool.use();
    }

    // 데이터를 주입할 때 - 1) 생성자, 2) setter, 3) 필드, 4) 자동화
    // pencil이 public이면 setter가 없어도 되긴 함
    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
}
