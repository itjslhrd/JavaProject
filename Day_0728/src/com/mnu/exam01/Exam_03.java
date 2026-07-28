package com.mnu.exam01;
abstract class Animal2 {
    abstract void sound();
    void move() {
        System.out.println("동물이 이동합니다.");
    }
}

class Dog extends Animal2 {
    void sound() {
        System.out.println("멍멍");
    }
    void move() {
        System.out.println("동물이 이동합니다2.");
    }
}

public class Exam_03 {
	public static void main(String[] args) {
        Animal2 a = new Dog();
        a.move();
        a.sound();
	}

}
