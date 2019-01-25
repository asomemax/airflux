package airflux;

import java.util.ArrayList;

/*
 * This class is a shape that is based upon the points entered. There is no 
 * pre-done centering or other behavior
 * 
 */
public class Shape {
	public double[][] coords;
	public ArrayList<Double> InitialCrds = new ArrayList<Double>();

	public Shape(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; i++) {
				coords[i][j] = a[i][j];
			}
		}
	}
	public double[][] getPoints(){
		return coords;
	}
}
