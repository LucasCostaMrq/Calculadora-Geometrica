package br.edu.figplanas;

import javax.swing.JOptionPane;

public class Losango {
	public static double lado;
	public static double perimetro;
	public static double diagMaior;
	public static double diagMenor;
	public static double area;
	
	public Losango() {
		lado = 0;
		perimetro = 0;
		diagMaior = 0;
		diagMenor = 0;
		area = 0;
	}
	public static void runnerLosango() {
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
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	public static void calcArea() {
		while (true) {
			try {
				diagMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal maior: "));
				diagMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor: "));
				if(diagMaior < diagMenor) {
					JOptionPane.showMessageDialog(null, "A diagonal deve ter um valor maior. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					continue;
				}
				else if(diagMaior == diagMenor) {
					JOptionPane.showMessageDialog(null, "A diagonal deve ter um valor maior. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					continue;
				}
				else {
					area = (diagMaior * diagMenor)/2;
					JOptionPane.showMessageDialog(null, "A área do losango resulta em: " + area + " cm2/m2");
					break;
				}
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
				JOptionPane.showMessageDialog(null, "O perimetro do losango resulta em: " + perimetro + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}

		
	}
	public static int scannerEntrada(int choose) {
		while (true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Area\n[2] Perimetro"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
