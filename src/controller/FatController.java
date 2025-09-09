package controller;

import br.edu.fateczl.pilhaint.No;
import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	public FatController() {
		super();
	}
	
	public long fatorial(int num) throws Exception {
		Pilha pilha = new Pilha();
		int fat = 1;
		while(num>0) {
			pilha.push(num);
			num--;
		}
		while(!pilha.isEmpty()) {
			fat *= pilha.pop();
		}
		return fat;
		
	}
}
