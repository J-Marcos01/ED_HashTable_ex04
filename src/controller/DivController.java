package controller;

import br.edu.fateczl.Lista.Lista;

public class DivController {

	Lista<Integer>[]tabela;
	
	public DivController() {
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
		num=num%5;
		return num;
				
	}
	public void list() throws Exception {
		System.out.println("Tabela por divisão");
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

