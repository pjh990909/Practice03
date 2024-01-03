package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int co=0;
		int no=0;
		System.out.print("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				co=co+1;
				no=no+i;
			}
		}System.out.println("5의 배수의 개수: "+ co);
		System.out.println("5의 배수의 합: "+ no);
		
		
		
		
		
		
		
		sc.close();
		

	}

}
