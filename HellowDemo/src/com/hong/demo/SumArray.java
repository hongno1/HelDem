package com.hong.demo;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] adds = new int[3][];
		adds[0] = new int[]{3,8,2};
		adds[1] = new int[]{2,7};
		adds[2] = new int[]{9,0,1,6};
		
		int sum = 0;
		for(int i=0; i<adds.length; i++){
			for(int j=0; j<adds[i].length; j++){
				System.out.print(adds[i][j]+"\t");
				sum += adds[i][j];
			}		
			System.out.println();
		}
		System.out.println("所有的数组的和为：" +sum);
	
	}

}
