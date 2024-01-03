package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=num;i<=num;i--) {
			for(int z=1;z<=i;z++) {
				System.out.print("*");
			}if(i==1) {
				break;
			}
			
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
