package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import controller.FatController;

public class Principal {

	public static void main(final String[] args) throws Exception {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int valor = 0;
	do {
		
		System.out.println("Entre o valor");	
		String input = reader.readLine();
		valor = Integer.parseInt(input);
		
	}while(valor < 1 && valor > 20 );
		
	System.out.println(FatController.fatorial(valor));
		
	}
}