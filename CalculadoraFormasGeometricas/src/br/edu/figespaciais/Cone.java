package br.edu.figespaciais;

import javax.swing.JOptionPane;

public class Cone {
	public static double volume;
	public static double areaTotal;
	public static double areaBase;
	public static double areaLateral;
	public static double raio;
	public static double altura;
	public static double geratriz;
	
	public Cone() {
		volume = 0;
		areaTotal = 0;
		areaBase = 0;
		areaLateral = 0;
		raio = 0;
		altura = 0;
		geratriz = 0;
	}
	public static void runnerCone() {
		int choose = 0;
		while(true) {
			choose = scannerEntrada(choose);
			if (choose == 1){
				calcAreaTotal();
				break;
			}
			else if(choose == 2) {
				calcVolume();
				break;
			}
			else if(choose == 3) {
				calcAreaLateral();
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
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				areaBase = Math.PI * Math.pow(raio, 2); 
				volume = (areaBase * altura) / 3;
				JOptionPane.showMessageDialog(null, "O valor do volume do cone resulta em: " + volume + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaTotal() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				areaBase = Math.PI * Math.pow(raio, 2);
				geratriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
				areaLateral = Math.PI * raio * geratriz;
				areaTotal = areaBase + areaLateral;				
				JOptionPane.showMessageDialog(null, "O valor da área total resulta em: " + areaTotal + " cm2/m2");
				break;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaLateral() {
		while(true) {
			try {
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				areaBase = Math.PI * Math.pow(raio, 2);
				geratriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
				areaLateral = Math.PI * raio * geratriz;	
				JOptionPane.showMessageDialog(null, "O valor da área lateral resulta em: " + areaLateral + " cm2/m2");
				break;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static int scannerEntrada(int choose) {
		while (true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Área Total\n[2] Volume\n[3] Área Lateral"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
