package br.edu.figespaciais;

import javax.swing.JOptionPane;

public class Esfera {
	public static double areaSuperf;
	public static double volume;
	public static double raio;
	public static double angulo;
	public static double fusoEsfer;
	
	public Esfera() {
		areaSuperf = 0;
		volume = 0;
		raio = 0;
		angulo = 0;
		fusoEsfer = 0;
	}
	
	public static void runnerEsfera() {
		int choose = 0;
		while(true) {
			choose = scannerEntrada(choose);
			if (choose == 1){
				calcAreaSuperficie();
				break;
			}
			else if(choose == 2) {
				calcVolume();
				break;
			}
			else if(choose == 3) {
				calcFusoEsferico();
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcVolume() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				volume = (4 * Math.PI * Math.pow(raio, 3))/3;
				JOptionPane.showMessageDialog(null, "O valor do volume da esfera resulta em: " + volume + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaSuperficie() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				areaSuperf = 4 * Math.PI * Math.pow(raio, 2);
				JOptionPane.showMessageDialog(null, "O valor da área da superfície da esfera resulta em: " + areaSuperf + " cm2/m2" );
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcFusoEsferico() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo: "));
				fusoEsfer = (Math.PI * Math.pow(raio, 2)* angulo)/ 90;
				JOptionPane.showMessageDialog(null, "O valor da área do fuso esférico resulta em: " + fusoEsfer + " cm2/m2" );
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static int scannerEntrada(int choose) {
		while (true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Área Total\n[2] Volume\n[3] Fuso Esférico"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}	
}
