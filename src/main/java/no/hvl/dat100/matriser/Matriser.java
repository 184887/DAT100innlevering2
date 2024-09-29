package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] abc = { { 0, 1, 1, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 1, 1, 0 } };

				int[][] ad = { 	{ 0, 0, 1, 1, 1, 1, 0, 0 }, 
								{ 0, 1, 0, 0, 0, 0, 1, 0 },
								{ 0, 1, 0, 0, 0, 0, 1, 0 },
								{ 0, 0, 1, 1, 1, 1, 0, 0 },
								{ 0, 1, 0, 0, 0, 0, 1, 0 },
								{ 0, 1, 0, 0, 0, 0, 1, 0 },
								{ 0, 1, 0, 0, 0, 0, 1, 0 },
								{ 0, 0, 1, 1, 1, 1, 0, 0 },
							};

							int[][] speilet = { {1,4,7},
												{2,5,8}, 
												{3,6,9} };

				

		int[][] sTab =  speile(speilet);
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
		
		int linjePos = -1;
		
		for (int i = 0; i < matrise.length; i++) {
			int nyRad = 0; 
			linjePos++;;
			
			for (int j = 0; j < matrise[i].length; j++) {
				sTab[i][j] = matrise[nyRad][linjePos];
				nyRad++;
				
				
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
