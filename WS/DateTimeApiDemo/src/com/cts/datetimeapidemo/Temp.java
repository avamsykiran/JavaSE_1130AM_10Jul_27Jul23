package com.cts.datetimeapidemo;

public class Temp {

	public static void main(String[] args) {
		for(int i=1;i<=12;i++){
			for(int j=1;j<=15;j++){
				for(int k=1;k<=8;k++){
					System.out.print("Block-"+i+"\t");
					System.out.print(j + (j==1?"st":(j==2?"nd":(j==3?"rd":"th"))) +" Floor\t");
					System.out.println(String.format("%d%02d%d", i,j,k));
				}
			}
		}
	}

}
