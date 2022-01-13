package eggdrop;
import eggdrop.Memoization;
import eggdrop.Tabulation;
import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//DISCLAIMER: Java da demasiados problemas con la gestión de directorios
		// copie en la siguiente linea la ruta absoluta del fichero a leer
		
		File file = new File("C:\\Users\\Station\\Desktop\\test.txt");
	    
		// !! LINEA SUPERIOR !!  COPIAR RUTA 
		
		Scanner sc = new Scanner(file);
	    int eggs = Integer.valueOf(sc.next());
	    System.out.print("Huevos: ");
	    System.out.print(eggs);
	    int floors = Integer.valueOf(sc.next());
	    System.out.print("  Pisos: ");
	    System.out.println(floors);
	    
	    System.out.print("Memoization -> ");
	    System.out.println(Memoization.solve_memoization(eggs, floors));
	    System.out.print("Tabulation -> ");
	    System.out.println(Tabulation.solve_tabulation(eggs, floors));
	    
	
	}
}
