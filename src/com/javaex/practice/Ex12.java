package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num01 = 1;
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i =1; i<=num;i++) {
			num01=num01*i;
		}
		System.out.println("결과값: "+num01);
		
		
		
		
		
		sc.close();

	}

}
