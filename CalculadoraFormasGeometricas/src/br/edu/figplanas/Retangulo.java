package br.edu.figplanas;
import javax.swing.JOptionPane;

public class Retangulo {
	public static double base;
	public static double altura;
	public static double area;
	public static double perimetro;
	public static double diagonal;
	
	public Retangulo() {
		base = 0;
		altura = 0;
		area = 0;
		perimetro = 0;
		diagonal = 0;
	}
	
	public static void runnerRetangulo() {
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
				base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				area = base * altura;
				JOptionPane.showMessageDialog(null, "A área do retângulo resulta em " + area+ " cm2/m2");
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcPerimetro(){
		while (true) {
			try {
				base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				perimetro = (base * 2) + (altura * 2);
				JOptionPane.showMessageDialog(null, "A área do retângulo resulta em " + perimetro+ " cm/m");
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
				base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));  
				JOptionPane.showMessageDialog(null, "A diagonal do retângulo resulta em " + diagonal + " cm/m");
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
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Area\n[2] Perimetro\n[3] Diagonal"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
