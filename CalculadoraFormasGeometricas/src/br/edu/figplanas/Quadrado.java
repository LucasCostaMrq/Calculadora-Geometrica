package br.edu.figplanas;
import javax.swing.JOptionPane;

public class Quadrado {
	
	public static double lado;
	public static double area;
	public static double diagonal;
	public static double perimetro;
	
	public Quadrado(){
		lado = 0;
		area = 0;
		diagonal = 0;
		perimetro = 0;
	}
	public static void runnerQuadrado() {
		int choose = 0;
		while(true) {
			choose = scannerEntrada(choose);
			if (choose == 1){
				calcArea();
				break;
			}
			else if(choose == 2) {
				calcPerimetro();
				break;
			}
			else if(choose == 3) {
				calcDiagonal();
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	public static void calcArea() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				area = lado * lado;
				JOptionPane.showMessageDialog(null, "A área do quadrado resulta em: " + area + " cm2/m2");
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcPerimetro() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				perimetro = lado * 4;
				JOptionPane.showMessageDialog(null, "O perimetro do quadrado resulta em: " + perimetro + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcDiagonal() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				diagonal = lado * Math.sqrt(2);
				JOptionPane.showMessageDialog(null, "A diagonal do quadrado resulta em: " + diagonal);
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static int scannerEntrada(int choose) {
		while (true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Area\n[2] Perimetro\n[3] Diagonal"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
