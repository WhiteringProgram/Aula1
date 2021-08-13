package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void ConcatenaInteiro () {
		int x = 0;
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			x = x + 1;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
	
		System.out.println("Inteiro =>" +tempoTotal + "ns");
	}
	public void SegundoConcatena () {
		int x = 0;
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			x = x + 1;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Inteiro =>" +tempoTotal + "ns");
	}
	public void TerceiroConcatena () {
		int x = 0;
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			x = x + 1;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
	
		System.out.println("Inteiro =>" +tempoTotal + "ns");
	}
}
