package br.edu.figplanas;

import javax.swing.JOptionPane;

public class Circulo {
	
	public static double raio;
	public static double area;
	public static double perimetro;
	public static double diametro;
	public static double angulo;
	public static double areaSetor;
	
	public Circulo() {
		raio = 0;
		area = 0;
		perimetro = 0;
		diametro = 0;
		angulo = 0;
		areaSetor = 0;
						
	}
	public static void runnerCirculo() {
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
				calcDiametro();
				break;
			}
			else if(choose == 4) {
				areaSetor();
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
			
	}
	
	public static void calcArea() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				area = Math.PI * Math.pow(raio, 2);
				JOptionPane.showMessageDialog(null, "O valor da área do círculo resulta em "+ area + " cm2/m2");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcPerimetro() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				perimetro = 2 * Math.PI * raio;
				JOptionPane.showMessageDialog(null, "O valor do perimetro do círculo resulta em "+ perimetro + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcDiametro() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				diametro = 2 * raio;
				JOptionPane.showMessageDialog(null, "O valor do diâmetro do círculo resulta em "+ diametro + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void areaSetor() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
				angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo do setor: "));
				areaSetor  = (Math.pow(raio, 2) * Math.PI * angulo)/360;
				JOptionPane.showMessageDialog(null, "O valor da área do setor círcular resulta em "+ areaSetor + " cm/m");
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static int scannerEntrada(int choose) {
		while (true) {
			 try {
				 choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o que deseja calcular no círculo:\n[1] Área\n[2] Perímetro \n[3] Diâmetro \n[4] Área do Setor "));
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
		 return choose;
	}
}
