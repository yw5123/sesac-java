package org.example.JavaIntro;

// 다른 class나 package에서 import해서 쓰려면 public으로 선언되어야 함
public class Dog2 {
    public static int count;
    public String breed;
    public String name;

    public Dog2(String breed, String name) {
        this.breed = breed;
        this.name = name;
        count++;
    }

    public void sitDown() {
        System.out.println(name + ", sit down");
    }

    public void giveHand() {
        System.out.println(name + ", hand");
    }
}
