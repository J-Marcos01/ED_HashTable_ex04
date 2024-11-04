package controller;

import br.edu.fateczl.Lista.Lista;

public class MultController {

	Lista<Integer>[]tabela;
	
	public MultController() {
		tabela=new Lista[5];
		inicializaTabela();
	}

	private void inicializaTabela() {
		int tamanho=tabela.length;
		for(int i=0;i<tamanho;i++) {
			tabela[i]=new Lista();
		}
		
	}
	public Lista[]novaLista(Lista [] original) throws Exception {
		int size=original.length;
		
		for(int i=0;i<size;i++) {
			int tamanho=original[i].size();
			for(int j=0;j<tamanho;j++) {
				int pos=(int) original[i].get(j);
				pos=hashCode(pos);
				tabela[pos].addFirst((Integer) original[i].get(j));
				
			}
		}
		return tabela;
	}
	private int hashCode(int num) {
		double a = (Math.sqrt(13) - 3) / 2;
		int pos=(int) ((int) 5 * ((a * num) % 1));
		return pos;
				
	}
	public void list() throws Exception {
		System.out.println("\nTabela por multiplicação");
		int tamanho=tabela.length;				
				for(int i=0;i<tamanho;i++) {
					System.out.println("\nLinha "+ i +" Tem "+ tabela[i].size()+ " Elementos ");
				int size=tabela[i].size();
				for(int j=0;j<size;j++) {
					System.out.print (tabela[i].get(j)+"-" );
					
				}
			}
	}
}
