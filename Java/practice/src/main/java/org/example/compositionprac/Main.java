package org.example.compositionprac;

// 실습 및 풀이

// - 다음을 구현하시오.
//    - 색상, 쓰기 기능을 갖는 Pencil 클래스를 구현하시오.
//    - 이름, Pencil을 갖는 Person 클래스를 구현하시오.
//        - write() 메소드를 통해 연필로 쓰기 기능 구현

// - 다음을 구현하시오.
//    - 마력을 갖는 Engine 클래스를 구현하시오.
//    - 모델명, Engine, 가속 기능을 갖는 Car 클래스를 구현하시오.
//        - Engine의 마력에 따라 속도가 크게 빨라지는 기능 구현

// - 다음을 구현하시오.
//    - 공격력, 내구력을 갖는 Weapon 클래스를 구현하시오.
//        - 특별 공격 기능을 갖는 Gun, Sword 클래스를 구현하시오.
//    - 체력, 공격 기능을 갖는 Character 클래스를 구현하시오.
//        - 무기가 없으면 기본공격, 무기가 있으면 무기의 공격력만큼 추가 공격을 하는 기능 구현
//        - 무기를 사용한 특별 공격 구현

public class Main {
    public static void main(String[] args) {
        // Pencil - Person
        Pencil green = new Pencil("green");
        Person jun = new Person("jun", green);
        jun.pencil.write("글씨를 써요");     // 글씨를 써요 - green색 연필로 씀
        jun.write("글씨를 써요");            // 글씨를 써요 - green색 연필로 씀

        // 펜을 바꿀 수 있다!
        Pencil blue = new Pencil("blue");
        jun.setPencil(blue);
        jun.write("연필 바꿔서 써요");        // 연필 바꿔서 써요 - blue색 연필로 씀

        Pencil yellow = new Pencil("yellow");
        Person lynda = new Person("lynda", new Pencil[] {green, blue, yellow});
        lynda.writeMany("많이 써요");       // 많이 써요 - green색 연필로 씀 / 많이 써요 - blue색 연필로 씀 / 많이 써요 - yellow색 연필로 씀


        // Engine - Car
        Engine engine1 = new Engine(6);
        Engine engine2 = new Engine(10);

        Car hyundai = new Car("hyundai", engine1);
        Car bmw = new Car("bmw", engine2);

        hyundai.increaseSpeed();
        System.out.println("현재 속도는 " + hyundai.speed);    // 현재 속도는 36

        bmw.increaseSpeed();
        System.out.println("현재 속도는 " + bmw.speed);   // 현재 속도는 100


        // Person을 new Person(name, 도구) 으로 생성하고
        // person.use() 했을 때 pencil을 갖고 있으면 연필을 사용하고 car를 갖고 있으면 속력을 높이게 확장
        Pencil purple = new Pencil("purple");
        Person beemo = new Person("beemo", purple);
        beemo.use();        // 글씨를 쓴다. - purple색 연필로 씀

        beemo.tool = hyundai;
        System.out.println("현재 속도는 " + hyundai.speed);  // 현재 속도는 36
        beemo.use();
        System.out.println("현재 속도는 " + hyundai.speed);  // 현재 속도는 72


        // Weapon - Character
        Character frog = new Character(192, 4);
        frog.attack();   // attack! - 4

        Sword sword = new Sword(8);
        frog.setWeapon(sword);
        frog.attack();  // attack! - 4 / weapon attack! - 8 / special attack: slash! - 16

        Gun gun = new Gun(13);
        Character duck = new Character(203, 3, gun);
        duck.attack();  // attack! - 3 / weapon attack! - 13 / special attack: shoot! - 39

        duck.setWeapon();
        duck.attack();  // attack! - 3

        // specialAttack(SA) 구현 방법
        // 1. 강사님은 실습하면서 Weapon과 SAable을 따로 분리 => Gun, Sword가 Weapon과 SA를 상속받음
        //    Character가 Weapon을 받아서 SA 사용 불가능
        //    => Character의 SA 메서드 내부에서 Weapon이 SAable을 구현하는지 확인 (instanceof 연산자 사용)
        // 2. Weapon과 SA를 분리하지 않고 합침 => Weapon은 기본 SA로 아무것도 안 함을 가짐
        // 3. Weapon이 SA를 compostion으로 가짐 => SA이 null인지 확인
    }
}
