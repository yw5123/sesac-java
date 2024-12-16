package org.example.inheritance;

public class Parent {
    public String publicValue = "publicValue";
    private String privateValue = "privateValue";
    protected String protectedValue = "protectedValue";

    public Parent(String publicValue) {
        this.publicValue = publicValue;
    }

    public void publicMethod() {
        System.out.println("publicMethod");
    }
}
