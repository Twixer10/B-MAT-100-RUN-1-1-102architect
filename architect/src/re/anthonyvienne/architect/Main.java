package re.anthonyvienne.architect;

import re.anthonyvienne.architect.Geometry.matrix;

public class Main {
	
	static Integer i = 0;
	
	public static void main(String[] args) {
		if(args.length == 0 || args.length == 2) {
			System.exit(84);
		} else if (args[0].equals("-h")) {
			System.out.println("USAGE"
					+ "\n"
					+ "\t./102architect x y transfo1 arg11 [arg12] [transfo2 arg12 [arg22]] ..."
					+ "\n"
					+ "DESCRIPTION"
					+ "\n"
					+ "\tx\tabscissa of the original point"
					+ "\n\ty\tordinate of the original point"
					+ "\n"
					+ "\n\ttransfo arg1 [arg2]"
					+ "\n\t-t i j\ttranslation along vector (i, j)"
					+ "\n\t-z m n\tscaling by a factor m (x-axis) and n (y-axis)"
					+ "\n\t-r d\trotation centered in 0 by a d degree angle"
					+ "\n\t-s d\treflexion over the axis passing through 0 with an inclination angle of d degrees");
			System.exit(0);
		}
		check_args(args);
		matrix(args);
	}
	
	private static void matrix(String[] args) {
		if (args.length > i) {
			if (args[i].equals("-t")) {
				new matrix(args).applyTranslation(args[i+1], args[i+2], (args.length > i+3?true:false));
				i += 3;
				matrix(args);
			} else if (args[i].equals("-z")) {
				new matrix(args).applyScale(args[i+1], args[i+2], (args.length > i+3?true:false));
				i += 3;
				matrix(args);
			} else if (args[i].equals("-r")) {
				new matrix(args).applyRotation(args[i+1], (args.length > i+2?true:false));
				i += 2;
				matrix(args);
			} else if (args[i].equals("-s")) {
				new matrix(args).applyReflexion(args[i+1], (args.length > i+2?true:false));
				i += 2;
				matrix(args);
			}
		} else {
			return;
		}
	}
	
	private static void check_args(String[] args) {
		try {
			Integer.valueOf(args[i+1]);
			Integer.valueOf(args[i]);
		} catch (Exception e) {
			System.exit(84);
		}
		i = 2;
		if (args[i].equals("-t")) {
			try {
				Integer.valueOf(args[i+1]);
				Integer.valueOf(args[i+2]);
			} catch (Exception e) {
				System.exit(84);
			}
			i += 2;
		} else if (args[i].equals("-z")) {
			try {
				Integer.valueOf(args[i+1]);
				Integer.valueOf(args[i+2]);
			} catch (Exception e) {
				System.exit(84);
			}
			i += 2;
		} else if (args[i].equals("-r")) {
			try {
				Integer.valueOf(args[i+1]);
			} catch (Exception e) {
				System.exit(84);
			}
			i += 1;
		} else if (args[i].equals("-s")) {
			try {
				Integer.valueOf(args[i+1]);
			} catch (Exception e) {
				System.exit(84);
			}
			i += 1;
		}
		i = 2;
	}
}
