package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] tab = { { 3, 2, 1, 7 }, 
				{ 9, 11, 5, 4 }, 
				{ 6, 0, 13, 17 }, 
				{ 7, 21, 14, 15 } };

		// skrivUt(tab);
	
		skaler(tab);
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print("[");
		for (int[] rad : matrise) {
			for (int i : rad) {
				System.out.print(i + ", ");
			}
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder();
		for (int[] rad : matrise) {
			sb.append("\n");
			for (int i : rad) {
				sb.append(i + " ");
			}
		}
		String tableAsString = sb.toString();

		return tableAsString;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		tall = 2;

		int rads = matrise.length ;
		int kol = matrise[0].length - 1;

		int[][] tab2 = new int[rads][kol];
		
		for (int rad  = 0; rad < rads; rad++) {
			for (int i = 0; i < kol; i++) {
				tab2[rad][i] = matrise[rad][i] * tall;
			}
		}

		return tab2; 

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
