package com.thanhhv;

import java.util.ArrayList;

// tính từng góc mà điểm X với 2 đỉnh bất kỳ của đa giác
// nếu tổng số góc là 360 thì nằm trong, ngược lại, nằm ngoài.

public class Algorithm2 {
	private ArrayList<Point> arr; // chứa các đỉnh của đa giác
	
	public Algorithm2(ArrayList<Point> arr) {
		this.arr = arr;
	}
	
	// trả về true nếu nằm trong
	// ngược lại trả về false
	public boolean gogogo(Point px) {
		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (px.isEqual(arr.get(i))) return true;
			
			int ia = i;
			int ib = i + 1;
			if (i == arr.size() - 1) ib = 0; // end
			
			//System.out.println(tinhGoc(px, arr.get(ia), arr.get(ib)));
			sum += tinhGoc(px, arr.get(ia), arr.get(ib));
		}
		
		if (Math.round(sum) == 360) return true;
		return false;
	}
	
	// trả về số góc của điểm X với 2 đỉnh A, B
	private double tinhGoc(Point px, Point pa, Point pb) {
		
		Point v1 = new Point(pa.x - px.x, pa.y - px.y);
		Point v2 = new Point(pb.x - px.x, pb.y - px.y);
		
		double cosv1v2 = (v1.x * v2.x + v1.y * v2.y) / (Math.sqrt(v1.x * v1.x + v1.y * v1.y) * Math.sqrt(v2.x * v2.x + v2.y * v2.y));
		
		return Math.toDegrees(Math.acos(cosv1v2));
	}
}
