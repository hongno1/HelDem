package com.hong.demo;

public class ZhiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		long start = System.currentTimeMillis();
		for(int i = 2; i<=1000; i++){
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					flag = true;
					break;
				}	
			}
			
			if(flag == false){
				System.out.println(i);
			}
			flag = false;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("所发费的时间为："+ (end - start));

	}

}
