package br.edu.figespaciais;

import javax.swing.JOptionPane;

public class Cubo {
	public static double lado;
	public static double areaTotal;
	public static double diagonalCubo;
	public static double perimetro;
	public static double volume;
	
	public Cubo() {
		lado = 0;
		areaTotal = 0;
		diagonalCubo = 0;
		perimetro = 0;
		volume = 0;
	}
	public static void runnerCubo() {
		int choose = 0;
		while(true) {
			choose = scannerEntrada(choose);
			if (choose == 1){
				calcVolume();
				break;
			}
			else if(choose == 2) {
				calcAreaTotal();
				break;
			}
			else if(choose == 3) {
				calcDiagonal();
				break;
			}
			else if(choose == 4) {
				calcPerimetro();
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcVolume() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				volume = Math.pow(lado, 3);
				JOptionPane.showMessageDialog(null, "O volume do quadrado resulta em: " + volume + " cm3/m3");
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaTotal() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				areaTotal = 6 * Math.pow(lado, 2);
				JOptionPane.showMessageDialog(null, "A área total do quadrado resulta em: " + areaTotal + " cm2/m2");
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcDiagonal() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				diagonalCubo = lado * Math.sqrt(3);
				JOptionPane.showMessageDialog(null, "A diagonal do quadrado resulta em: " + diagonalCubo + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcPerimetro() {
		while (true) {
			try {
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				perimetro = lado * 12;
				JOptionPane.showMessageDialog(null, "O perimetro do quadrado resulta em: " + perimetro + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static int scannerEntrada(int choose) {
		while (true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Volume\n[2] Área Total\n[3] Diagonal \n[4] Perímetro "));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
