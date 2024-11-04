package view;

import br.edu.fateczl.Lista.Lista;
import controller.DivController;
import controller.MultController;

public class Principal {
	public static void main(String[] args) {
		
	
	DivController divCont = new DivController();
	MultController multiCont = new MultController();
		
	Lista<Integer>[]lista=new Lista[10];

	for (int i = 0; i < 10; i++) {
		lista[i] = new Lista();
	}

	try {
		lista[0].addFirst(12);
		lista[0].addLast(647);
		lista[0].addLast(158);
		lista[0].addLast(136);
		lista[0].addLast(467);
		lista[1].addFirst(156);
		lista[1].addLast(600);
		lista[1].addLast(551);
		lista[2].addFirst(263);
		lista[2].addLast(414);
		lista[2].addLast(882);
		lista[2].addLast(945);
		lista[2].addLast(914);
		lista[2].addLast(953);
		lista[2].addLast(629);
		lista[3].addFirst(884);
		lista[3].addLast(795);
		lista[3].addLast(194);
		lista[3].addLast(513);
		lista[4].addFirst(591);
		lista[4].addLast(847);
		lista[4].addLast(66);
		lista[4].addLast(337);
		lista[4].addLast(979);
		lista[5].addFirst(768);
		lista[5].addLast(53);
		lista[6].addFirst(114);
		lista[6].addLast(803);
		lista[6].addLast(90);
		lista[6].addLast(339);
		lista[6].addLast(550);
		lista[7].addFirst(574);
		lista[7].addLast(977);
		lista[7].addLast(216);
		lista[7].addLast(99);
		lista[7].addLast(617);
		lista[7].addLast(88);
		lista[8].addFirst(142);
		lista[8].addLast(148);
		lista[8].addLast(227);
		lista[8].addLast(939);
		lista[8].addLast(585);
		lista[8].addLast(338);
		lista[8].addLast(206);
		lista[9].addFirst(569);
		lista[9].addLast(708);
		lista[9].addLast(844);
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}

	try {
		Lista [] divLista = divCont.novaLista(lista);
		Lista [] multiLista = multiCont.novaLista(lista);
		
		divCont.list();
		Thread.sleep(1000);
		multiCont.list();
	} catch (Exception e1) {
		System.err.println(e1.getMessage());
	}
}
	
}
