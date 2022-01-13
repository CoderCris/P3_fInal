package eggdrop;

public class Tabulation {
	
	
	//metodos comparativos auxiliares
	
	public static int max(int a, int b) {
		return (a > b) ? a:b;
	}
	
	public static int min(int a, int b) {
		return (a > b) ? b:a;
	}
	
	
	
	public static int solve_tabulation(int eggs, int floors) {
	
		int tab[][] = new int [eggs + 1][floors + 1];
		int res = Integer.MAX_VALUE;
		
		//caso 1 solo huevo
		for(int k = 1; k <= floors; k++) {
			tab[1][k] = k;
		}
		
		//caso 1 o 0 pisos
		for(int n = 1; n <= eggs; n++) {
			tab[n][0] = 0;
			tab[n][1] = 1;
		}
		
		//resto de casos
		for(int n = 2; n <= eggs; n++) {
			for(int k = 2; k<=floors; k++) {
				
				//control de errores
				tab[n][k]= Integer.MAX_VALUE;
				res = Integer.MAX_VALUE;
				
				//se simula tirar huevos de x en x pisos comparando que valor da
				//un resultado menor para EL PEOR DE LOS CASOS
				for(int x = 1; x<=k; x++) {
					res = min(res, 1+max(tab[n-1][x-1], tab[n][k-x]));
				}
				
				
				tab[n][k] = res;
			}
		}
		
		return tab[eggs][floors];
	}
}
