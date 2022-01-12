package eggdrop;
import eggdrop.Memoization;
import eggdrop.Tabulation;
import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//get infop from file
		  File file = new File("C:\\Users\\Station\\Desktop\\test.txt");
		    Scanner sc = new Scanner(file);
		    int eggs = Integer.valueOf(sc.next());
		    System.out.println(eggs);
		    int floors = Integer.valueOf(sc.next());
		    System.out.println(floors);
		    
		    System.out.println(Memoization.solve_memoization(eggs, floors));
		    System.out.println(Tabulation.solve_tabulation(eggs, floors));
		    
		    
		    //int params[] = scan_line.split(' ');
		
		//call memo
		
		//call tab
	
	}
}
