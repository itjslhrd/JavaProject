package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//Stack, Queue

public class Exam_08 {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		
		Deque<Integer> stack2 = new ArrayDeque();
		
		//삽입
		stack2.push(123);
		stack2.push(456);
		stack2.push(789);
		stack2.push(12);
		
		System.out.println("전체 : " + stack2);
		System.out.println("객체 수 : " + stack2.size());
		
		System.out.println("마지막 입력 객체 : " + stack2.peek());
		
		//System.out.println("마지막 입력 객체 꺼내기 : " + stack.pop());
		//System.out.println("객체 수 : " + stack.size());
		//확장 for// 확인용도
		for(Integer data : stack2) {
			System.out.println(data);
		}
		System.out.println("객체 수 : " + stack2.size());
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
		System.out.println("객체 수 : " + stack.size());
	}

}
