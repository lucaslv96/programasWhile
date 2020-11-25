package programasWhile;

public class programasBásicos {

	public static void main(String[] args) {

		int X = 13;
		int Z = 5;
		int Y = 7;

		// Z := Z+Y
		System.out.printf("Ejemplo suma 1: %d", suma(Z, Y));

		// Z := X+Y
		System.out.printf("\nEjemplo suma 2: %d", suma(X, Y));

		// Z := X-Y
		System.out.printf("\nEjemplo resta: %d", resta(X, Y));

		// Z := X*Y
		System.out.printf("\nEjemplo multiplicación: %d", multiplicación(X, Y));

		// Z := X div Y
		System.out.printf("\nEjemplo división: %.2f", división(X, Y));
		
		// Z := X mod Y
		System.out.printf("\nEjemplo módulo: %d", módulo(X, Y));
	}

	
	// succ(X)
	public static int succ(int X) {
		return X + 1;
	}

	// pred(X)
	public static int pred(int X) {
		return X - 1;
	}

	// Z := X
	public static int igual(int X) {

		int Z;

		Z = succ(X);
		Z = pred(Z);

		return Z;
	}

	
	// Z := Z+Y
	public static int suma(int Z, int Y) {

		int U = 0;

		while (U != Y) {
			Z = succ(Z);
			U = succ(U);
		}

		return Z;
	}

	
	// Z := Z-Y
	public static int resta(int Z, int Y) {

		if (Z >= Y) {
			int U = 0;

			while (U != Y) {
				Z = pred(Z);
				U = succ(U);
			}
		}

		else {
			return 0;
		}

		return Z;
	}

	
	// Z := X*Y
	public static int multiplicación(int X, int Y) {

		int Z = 0;
		int U = 0;

		while (U != Y) {
			Z = suma(Z, X);
			U = succ(U);
		}

		return Z;
	}

	
	// Z := X div Y
	public static double división(int X, int Y) {

		int W = succ(X);
		int Z = 0;
		int U = 0;

		while (W != U) {
			Z = succ(Z);
			W = resta(W, Y);
		}

		Z = pred(Z);

		return Z;
	}

	
	// Z := X mod Y
	public static int módulo(int X, int Y) {

		int W = succ(X);
		int Z = 0;
		int U = 0;

		while (W != U) {
			
			Z = igual(W);
			W = resta(W, Y);
		}

		Z = pred(Z);

		return Z;
	}
}
