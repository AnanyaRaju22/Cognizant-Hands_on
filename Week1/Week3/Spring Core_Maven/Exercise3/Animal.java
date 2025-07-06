package com.zoo;

public class Animal {
    private String name;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void speak() {
        System.out.println(name + " says " + sound);
    }
}
