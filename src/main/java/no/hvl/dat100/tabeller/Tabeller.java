package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

// Får en feil men den funker 
	// b)
	public static String tilStreng(int[] tabell) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tabell.length; i++) {

			sb.append(tabell[i]);

			if (i < tabell.length - 1) {
				sb.append(", ");
			}
		}

		String tableAsString = "[" + sb.toString() + "]";

		return tableAsString;
	}

	// c)
	public static int summer(int[] tabell) {
		int s = 0;
		for (int i : tabell) {
			s += i;
		}

		return s;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean s = false;
		for (int t : tabell) {
			if (t == tall) {
				s = true;
				break;
			} else {
				s = false;
			}
		}
		return s;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int s = 0;
		for (int i = 0; i < tabell.length; i++) {
			if (i == tall) {
				s = i;
				break;
			} else {
				s = -1;
			}
		}
		return s; 
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
	for(int i = 0; i < tabell; i++) {
			
		}

		return tabell[];
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
