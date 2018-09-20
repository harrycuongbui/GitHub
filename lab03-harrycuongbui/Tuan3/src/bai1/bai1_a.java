package bai1;

import java.util.Scanner;

public class bai1_a {
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		int a,b;
		System.out.println("Nhập vào số nguyên thứ nhất");
		a=nhap.nextInt();
		System.out.println("Nhập vào số nguyên thứ hai");
		b=nhap.nextInt();
		System.out.println("USCLN của 2 số vừa nhập là: " + USCLN(a, b));

		
	}
	//đệ quy tìm USCLN theo thuật toán của Ơ -clit
	 public static int USCLN(int a, int b) {
	        if (b == 0) return a;
	        return USCLN(b, a % b);
	    }

}
