package com.thanhhv;

public class Point {
	public double x;
	public double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void log() {
		System.out.println("x= " + x + ", y= " + y);
	}
	
	public boolean isEqual(Point p) {
		if (p.x == x && p.y == y) return true;
		return false;
	}
}
