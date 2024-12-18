package org.example.compositionprac;

public class Person {
    String name;
    Pencil pencil;
    Pencil[] pencils;

    public Person(String name, Pencil pencil) {
        this.name = name;
        this.pencil = pencil;
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

    // 데이터를 주입할 때 - 1) 생성자, 2) setter, 3) 필드, 4) 자동화
    // pencil이 public이면 setter가 없어도 되긴 함
    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
}
