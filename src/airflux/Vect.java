package airflux;

/*
 * Methods 
 * DotProduct
 * Legnth
 * CrossProduct
 */
public class Vect {
	public double x;
	public double y;
	public double z;

	public Vect(double i, double j, double k) {
		x = i;
		y = j;
		z = k;
	}

	public Vect(double i, double j) {
		x = i;
		y = j;
		z = 0;
	}

	public double dotProduct(Vect A, Vect B) {
		return A.x * B.x + A.y * B.y + A.z * B.z;
	}

	public double getLength(Vect A) {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public double angleBetween(Vect A, Vect B) {
		return Math.acos(dotProduct(A, B) / (getLength(A) * getLength(B)));
	}

	public Vect crossProduct(Vect A, Vect B) {
		double nx = A.y * B.z - A.z * B.y;
		double ny = A.z * B.x - A.x * B.z;
		double nz = A.x * B.y - A.y * B.x;
		return new Vect(nx, ny, nz);
	}
}
