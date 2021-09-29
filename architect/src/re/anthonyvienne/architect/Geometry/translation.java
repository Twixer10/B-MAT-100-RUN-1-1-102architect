package re.anthonyvienne.architect.Geometry;

public class translation {

	double x;
	double y;
	double z;
	double i;
	double j;
	double xa;
	double xb;
	double xc;
	double ya;
	double yb;
	double yc;
	double za;
	double zb;
	double zc;
	
	public translation(String x, String y, String i, String j) {
		this.x = Double.valueOf(x);
		this.y = Double.valueOf(y);
		this.z = 1;
		this.i = Double.valueOf(i);
		this.j = Double.valueOf(j);
		this.xa = 1;
		this.xb = 0;
		this.xc = Double.valueOf(this.i);
		this.ya = 0;
		this.yb = 1;
		this.yc = Double.valueOf(this.j);
		this.za = 0;
		this.zb = 0;
		this.zc = 1;
	}
	
	public void getVector() {
		System.out.println("Translation along vector (" + this.i + "," + this.j + ")");
		getMatrixTranslation();
	}
	
	public void getMatrixTranslation() {
		Double X = (this.x*this.xa)+(this.y*this.xb)+(this.z*this.xc);
		Double Y = (this.x*this.ya)+(this.y*this.yb)+(this.z*this.yc);
		Double Z = (this.x*this.za)+(this.y*this.zb)+(this.z*this.zc);
		Z = Z + 0;
		System.out.println(this.xa + "\t" + this.xb + "\t" + this.xc
				+ "\n" + this.ya + "\t" + this.yb + "\t" + this.yc
				+ "\n" + this.za + "\t" + this.zb + "\t" + this.zc);
		getCoordinateTranslation(X, Y);
	}
	
	public void getCoordinateTranslation(double X, double Y) {
		System.out.println("(" + this.x + ", " + this.y + ") => (" + X + ", " + Y + ")");
	}
}
