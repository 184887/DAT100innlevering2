package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] tab = { { 3, 2, 1, 7 },
						{ 9, 11, 5, 4 }, 
						{ 6, 0, 13, 17 }, 
						{ 7, 21, 14, 15 } };

		//skrivUt(tab);
System.out.print(tilStreng(tab));
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
		String tableAsString =  sb.toString();

		return tableAsString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");

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
