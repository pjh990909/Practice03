package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int z =1;z<=num+1-i;z++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
