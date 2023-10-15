package br.edu.figespaciais;

import javax.swing.JOptionPane;

public class Cilindro {	
	public static double volume;
	public static double altura;
	public static double raioBase;
	public static double areaTotal;
	public static double areaBase;
	public static double areaLateral;
	
	public Cilindro() {	
		volume = 0;
		altura = 0;
		raioBase = 0;
		areaTotal = 0;
		areaBase = 0;
		areaLateral = 0;
	}
	public static void runnerCilindro() {
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
				raioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				volume = (Math.PI * Math.pow(raioBase, 2))* altura;
				JOptionPane.showMessageDialog(null, "O valor do volume do cilindro resulta em: " + volume + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaTotal(){
		while(true) {
			try {
				raioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));				
				areaBase = Math.PI * Math.pow(raioBase, 2);
				areaLateral = 2 * Math.PI * raioBase * altura;
				areaTotal = (areaBase*2) + areaLateral;				
				JOptionPane.showMessageDialog(null, "O valor da área total resulta em: " + areaTotal);
				break;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaLateral(){
		while(true) {
			try {
				raioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da base: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da altura: "));							
				areaLateral = 2 * Math.PI * raioBase * altura;			
				JOptionPane.showMessageDialog(null, "O valor da área latral resulta em: " + areaLateral);
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
