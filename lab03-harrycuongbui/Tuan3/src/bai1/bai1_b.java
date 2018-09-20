package bai1;

import java.util.Scanner;

public class bai1_b {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số nguyên : ");
		n=nhap.nextInt();
		System.out.println("Số Fibonaxi của số nguyên vừa nhập là: " + Fibonaxi(n));
	}
	public static  int  Fibonaxi (int n) {
		if(n==0) {
			return 0;
		}if(n==1) {
			return 1;
		}else 
		return (Fibonaxi(n-1)+ Fibonaxi(n-2));
	}

}
