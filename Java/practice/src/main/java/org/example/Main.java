package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 200);
        System.out.println(rect1.width);
        System.out.println(rect1.calculateArea());

        Rectangle rect2 = new Rectangle(10, 1000);
        System.out.println(rect2.calculateArea());

        Circle c1 = new Circle(3);
        System.out.println(c1.radius);
        System.out.println(c1.calculateArea());
    }
}

