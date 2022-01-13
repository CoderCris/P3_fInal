package eggdrop;
import java.util.Arrays;

public class Memoization{
	
	//una matriz es más comoda de usar en Java
	static int mem [][];
	
	//metodos auxiliares de comparacion
	public static int max(int a, int b) {
		return (a > b) ? a:b;
	}
	
	public static int min(int a, int b) {
		return (a > b) ? b:a;
	}
	
	//metodo recursivo
	public static int fill_mem(int n, int k) {
		
		//si ya ha sido calculado, devolver dicho valor
		if(mem[n][k] != -1) {
			return mem[n][k];
		}
		
		//casos base 1 huevo, ningún piso y un piso
		if(n == 1 || k == 0 || k == 1)return k;
		
		//control de errores
		int res = Integer.MAX_VALUE;
		
		//se simula tirar huevos de x en x pisos comparando que valor da
		//un resultado menor para EL PEOR DE LOS CASOS
		for(int x = 1; x < k; x++) {
			res = min(res, 1+max(fill_mem(n-1, x-1), fill_mem(n, k-x)));
			mem[n][k] = res;
		}
		return res;		
	}
	
	
	public static int solve_memoization (int eggs, int floors) {
		
		mem = new int [eggs + 1][floors + 1];
		
		for (int i = 0, len = mem.length; i < len; i++)
		    Arrays.fill(mem[i], -1);
		
		fill_mem(eggs, floors);		
		return mem[eggs][floors];
	}	
}
