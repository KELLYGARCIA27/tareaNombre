package nombre;

import java.util.Scanner;

public class Imprimirnombre {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cuantas palabras tiene tu nombre?");	
		int cant = sc.nextInt();
		
		String arreglo [] = new String[cant];
		String aux;	
		
		for(int i=0; i<arreglo.length;i++) {	
			

			System.out.println("Escribe nombre: " + i + arreglo[i]);
			aux = sc.next();
			arreglo[i]= aux;		
	}	
		for(int i=0; i<arreglo.length; i++) 
		{
			
		System.out.println("Te llamas"+ i + ":" + arreglo[i] );	
		
			}
		sc.close();
			
	
}
}