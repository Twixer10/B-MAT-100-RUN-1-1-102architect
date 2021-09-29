package re.anthonyvienne.architect.Geometry;

import java.text.DecimalFormat;

public class matrix {
	
	DecimalFormat num = new DecimalFormat("0.00");
	
	double x;
	double y;
	double z = 1;
	double xa = 0;
	double xb = 0;
	double xc = 0;
	double ya = 0;
	double yb = 0;
	double yc = 0;
	double za = 0;
	double zb = 0;
	double zc = 1;
	
	
	public matrix(String[] args) {
		this.x = Double.valueOf(args[0]);
		this.y = Double.valueOf(args[1]);
	}

	public void applyRotation(String di, boolean so) {
		double d = Math.toRadians(Double.valueOf(di));
		this.xa = (double) Math.cos(Double.valueOf(d));
		this.xb = (double)-Math.sin(Double.valueOf(d));
		this.ya = (double) Math.sin(Double.valueOf(d));
		this.yb = (double) Math.cos(Double.valueOf(d));
		double X = (x*this.xa)+(y*this.xb)+(z*this.xc);
		double Y = (x*this.ya)+(y*this.yb)+(z*this.yc);
		double Z = (x*this.za)+(y*this.zb)+(z*this.zc);
		Z = Z + 0;
		if(so) {
			System.out.println("Rotation by a " + di + " degree angle");
		} else {
			System.out.println("Rotation by a " + di + " degree angle\n" 
					+ num.format(this.xa) + "\t" + num.format(this.xb) + "\t" + num.format(this.xc)
					+ "\n" + num.format(this.ya) + "\t" + num.format(this.yb) + "\t" + num.format(this.yc)
					+ "\n" + num.format(this.za) + "\t" + num.format(this.zb) + "\t" + num.format(this.zc)
					+ "\n(" + num.format(x) + ", " + num.format(y) + ") => (" + num.format(X) + ", " + num.format(Y) + ")");
		}
	}
	
	public void applyReflexion(String di, boolean so) {
		double d = Math.toRadians(Double.valueOf(di));
		this.xa = (double) Math.cos(Double.valueOf(2 * d));
		this.xb = (double) Math.sin(Double.valueOf(2 * d));
		this.ya = (double) Math.sin(Double.valueOf(2 * d));
		this.yb = (double) -Math.cos(Double.valueOf(2 * d));
		double X = (x*this.xa)+(y*this.xb)+(z*this.xc);
		double Y = (x*this.ya)+(y*this.yb)+(z*this.yc);
		double Z = (x*this.za)+(y*this.zb)+(z*this.zc);
		Z = Z + 0;
		if(so) {
			System.out.println("Reflection over an axis with an inclination angle of " + di + " degrees");
		} else {
			System.out.println("Reflection over an axis with an inclination angle of " + di + " degrees\n" 
					+ num.format(this.xa) + "\t" + num.format(this.xb) + "\t" + num.format(this.xc)
					+ "\n" + num.format(this.ya) + "\t" + num.format(this.yb) + "\t" + num.format(this.yc)
					+ "\n" + num.format(this.za) + "\t" + num.format(this.zb) + "\t" + num.format(this.zc)
					+ "\n(" + num.format(x) + ", " + num.format(y) + ") => (" + num.format(X) + ", " + num.format(Y) + ")");
		}
	}
	
	public void applyTranslation(String io, String jo, boolean so) {
		int i = Integer.valueOf(io);
		int j = Integer.valueOf(jo);
		this.xa = 1;
		this.xc = Double.valueOf(i);
		this.yb = 1;
		this.yc = Double.valueOf(j);
		double X = (x*this.xa)+(y*this.xb)+(z*this.xc);
		double Y = (x*this.ya)+(y*this.yb)+(z*this.yc);
		double Z = (x*this.za)+(y*this.zb)+(z*this.zc);
		Z = Z + 0;
		if(so) {
			System.out.println("Translation along vector (" + i + ", " + j + ")");
		} else {
			System.out.println("Translation along vector (" + i + ", " + j + ")\n" 
					+ num.format(this.xa) + "\t" + num.format(this.xb) + "\t" + num.format(this.xc)
					+ "\n" + num.format(this.ya) + "\t" + num.format(this.yb) + "\t" + num.format(this.yc)
					+ "\n" + num.format(this.za) + "\t" + num.format(this.zb) + "\t" + num.format(this.zc)
					+ "\n(" + num.format(x) + ", " + num.format(y) + ") => (" + num.format(X) + ", " + num.format(Y) + ")");
		}
	}
	
	public void applyScale(String mo, String no, boolean so) {
		int m = Integer.valueOf(mo);
		int n = Integer.valueOf(no);
		this.xa = Double.valueOf(m);
		this.yb = Double.valueOf(n);
		this.zc = Double.valueOf(z);
		double X = (x*this.xa)+(y*this.xb)+(z*this.xc);
		double Y = (x*this.ya)+(y*this.yb)+(z*this.yc);
		double Z = (x*this.za)+(y*this.zb)+(z*this.zc);
		Z = Z + 0;
		if(so) {
			System.out.println("Scaling by factors " + m + " and " + n);
		} else {
			System.out.println("Scaling by factors " + m + " and " + n + "\n" 
					+ num.format(this.xa) + "\t" + num.format(this.xb) + "\t" + num.format(this.xc)
					+ "\n" + num.format(this.ya) + "\t" + num.format(this.yb) + "\t" + num.format(this.yc)
					+ "\n" + num.format(this.za) + "\t" + num.format(this.zb) + "\t" + num.format(this.zc)
					+ "\n(" + num.format(x) + ", " + num.format(y) + ") => (" + num.format(X) + ", " + num.format(Y) + ")");
		}
	}
	
}
