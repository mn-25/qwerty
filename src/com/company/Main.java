package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a1 = sc.nextInt();
	int a2 = sc.nextInt();
	int b1 = sc.nextInt();
	int b2 = sc.nextInt();
		double k=(a2-a1)/(b2-b1);
		double a = a2-a1*k;

		System.out.println(1);
		System.out.println(-k);
		System.out.println(a);

	}
}
