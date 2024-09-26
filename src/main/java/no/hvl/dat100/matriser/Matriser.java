package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] abc = { { 3, 2, 1, 7 }, 
				{ 9, 11, 5, 4 }, 
				{ 6, 0, 13, 17 }, 
				{ 7, 21, 14, 15 } };

				int[][] ad = { 	{ 1, 0, 0, 0 }, 
								{ 0, 1, 0, 0 }, 
								{ 0, 0, 1, 0 }, 
								{ 0, 0, 0, 1 } 
								
							};

				

		int[][] sTab =  speile(ad);
		 //skrivUt(sTab);

		skrivUt(sTab);
	
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.print("[");
		for (int[] rad : matrise) {
			System.out.println();
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

		int[][] sTab = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				sTab[i][j] = matrise[i][j] * tall;
			}
		}

		return sTab;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
	boolean lik = true;


		
		if(a.length != b.length || a[0].length != b[0].length){
			return false;
			
		}
		
			for (int i = 0; i < a.length; i++){
				for(int j = 0; a[i].length < 0; j++){
					if(a[j][i] == a[j][i]){
						lik = true;
					}
					else if (a[j][i] != a[j][i]) {
						lik = false; 
				} 
				}
				
			}
			return lik;
		
		
	}

	// aV)
	public static int[][] speile(int[][] matrise) {

		int[][] sTab = new int[matrise.length][matrise[0].length];
		
		
		int rad = -1;

		for (int i = 0; i < matrise.length; i++) {
			rad++;
			int linje = 0;
			for (int j = 0; j < matrise[i].length; j++) {
				sTab[i][j] = matrise[matrise.length -1 - rad][matrise[i].length - 1 -linje];
				linje ++;
			}
		}
		return sTab;

	}

	// bV )
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
