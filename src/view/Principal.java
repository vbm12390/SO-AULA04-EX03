package view;

import controller.CalcThread;

public class Principal {
	
	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		
		for (int i =0;i<3;i++) {
			for (int j =0;j<5;j++) {
			matriz[i][j]=(int)((Math.random()*100)+1);
			}
		}
		Thread ThreadMatriz1 = new CalcThread(matriz[0]);
		Thread ThreadMatriz2 = new CalcThread(matriz[1]);
		Thread ThreadMatriz3 = new CalcThread(matriz[2]);
		ThreadMatriz1.start();
		ThreadMatriz2.start();
		ThreadMatriz3.start();
	}
}