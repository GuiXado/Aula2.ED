package view;

import controller.OrdenacaoControler;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		//int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		//int[] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};

		OrdenacaoControler oCont = new OrdenacaoControler();
		//vetor = oCont.bubbleSort(vetor);
		vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
		
		//System.out.println("");
		System.out.println("\n==================================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		//System.out.println("");
		System.out.println("\n==================================");
	}

}
