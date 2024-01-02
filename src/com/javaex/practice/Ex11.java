package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result=0;
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==1&&num%2==1) {
				result=result+i;
			}else if(i%2==0&&num%2==0){
				result=result+i;
			}
			
				
			
			
		}System.out.println("결과값: "+ result);
		
		
		
		
		
		
		
		sc.close();

	}

}
