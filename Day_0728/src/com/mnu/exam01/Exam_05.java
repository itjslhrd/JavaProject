package com.mnu.exam01;

interface Remote {
    void powerOn();
}

class TV implements Remote {
    public void powerOn() {
        System.out.println("TV 전원 ON");
    }
}

public class Exam_05 {
	public static void main(String[] args) {
		Remote r = new TV();
        r.powerOn();
	}

}
