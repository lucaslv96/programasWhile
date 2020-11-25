package programasWhile;

public class programasBásicos {

	public static void main(String[] args) {

		int X = 8;
		int Z = 5;
		int Y = 3;

		// Z := Z+Y
		System.out.printf("Ejemplo suma 1: %d", suma(Z, Y));

		// Z := X+Y
		System.out.printf("\nEjemplo suma 2: %d", suma(X, Y));

		// Z := X-Y
		System.out.printf("\nEjemplo resta: %d", resta(X, Y));
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
}
