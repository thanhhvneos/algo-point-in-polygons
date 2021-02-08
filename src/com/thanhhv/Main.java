package com.thanhhv;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		ArrayList<Point> arr = new ArrayList<Point>();
		arr.add(new Point(0.1, 1.2));
		arr.add(new Point(0.3, 1.3));
		arr.add(new Point(0.4, 1.6));
		arr.add(new Point(0.2, 1.4));
		
		Algorithm2 alg = new Algorithm2(arr);
		
		System.out.println(alg.gogogo(new Point(0.24, 1.35)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0.3, 1.4)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0.4, 1.6)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0.53, 1.51)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0, 0)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0, 1.23)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0, 1.33)) == false ? "passed" : "failed");
		
	}
	
	private static void test2() {
		ArrayList<Point> arr = new ArrayList<Point>();
		arr.add(new Point(2, 2));
		arr.add(new Point(7, 2));
		arr.add(new Point(7, 8));
		arr.add(new Point(2, 8));
		
		Algorithm2 alg = new Algorithm2(arr);
		
		System.out.println(alg.gogogo(new Point(2, 2)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(2, 3)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(3, 3)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(6, 6)) == true ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(8, 8)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(0, 0)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(8, 2)) == false ? "passed" : "failed");
		
		System.out.println(alg.gogogo(new Point(5.13, 9.19)) == false ? "passed" : "failed");
		
	}

}
