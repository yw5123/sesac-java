package org.example.compositionprac;

public class Car implements Tool {
    String model;
    int speed;
    Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.speed = 0;
        this.engine = engine;
    }

    public int increaseSpeed() {
        speed += engine.HP * engine.HP;
        return speed;
    }


    @Override
    public void use() {
        increaseSpeed();
    }
}
