package view;

import java.util.Scanner;

import controller.FatController;

public class Main {

	public static void main(String[] args) throws Exception {
		FatController fc = new FatController();
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while(num<0 || num>10) {
			num = sc.nextInt();
		}
		long fat = fc.fatorial(num);
		System.out.println(fat);
	}

}
