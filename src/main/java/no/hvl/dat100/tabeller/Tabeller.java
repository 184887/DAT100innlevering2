package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		
		
	}

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
				sb.append(",");
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
		int s = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				s = i;
			} 
		} 
		return s;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
		int nyPlass = reversert.length - 1;

		for (int i = 0; i < tabell.length; i++) {
			reversert[nyPlass] = tabell[i];
			nyPlass--;
		}

		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		
		boolean s = true;
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]){
				s = false;
				break;
			} 
		}
		return s;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		//p er en hjelpevariabel for å loope tabell2;
		int p = 0;
		int lengde = tabell1.length + tabell2.length;
		int[] tabell = new int[lengde];
		for (int i = 0; i<tabell1.length; i++) {
			tabell[i] = tabell1[i];
		}
		for (int i = tabell1.length; i < lengde; i++)	{
			tabell[i] = tabell2[p];
			p++;
		}
		return tabell;
	}
}