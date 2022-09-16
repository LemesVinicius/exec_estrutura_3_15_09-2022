package controller;

import br.com.leandrocolevati.pilhalong.*;

public class FatController {
	
	public static long fatorial(int valor) throws Exception {
		
		long fatorial = 0;
		
		Pilha pilha = new Pilha();
		
		for (int i = valor; i > 0; i--) {
			  pilha.push(i);
		}
		
		while(!pilha.isEmpty()) {
			
			if (fatorial == 0) {
				fatorial = pilha.pop();
			}else {
				fatorial = fatorial*pilha.pop();
			}
			
		}
		
		return fatorial;	
	}

}