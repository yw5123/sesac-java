package org.example.etc;

public class GenericPrac<T> {
    public T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
