package controller;

public class CalcThread extends Thread {
	private int[]vetor;
	private int soma = 0;
	
	public  CalcThread(int[]vetor){
	this.vetor = vetor;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			soma = vetor[i] + soma;
		}
		System.out.println(soma);

	}
	
}
