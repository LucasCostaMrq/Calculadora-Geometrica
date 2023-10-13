package br.edu.figplanas;

import javax.swing.JOptionPane;

public class Trapezio {
	public static double baseMaior;
	public static double baseMenor;
	public static double ladoUm;
	public static double ladoDois;
	public static double altura;
	public static double area;
	public static double perimetro;
	
	public Trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		ladoUm = 0;
		ladoDois = 0;
		altura = 0;
		area = 0;
		perimetro = 0;
		
	}
	public static void runnerTrapezio() { 
		int choose = 0;
		while(true) {
			choose = chooseCalc(choose);
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
				 baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior: "));
				 baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor: "));
				 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				 area = ((baseMaior + baseMenor)* altura) / 2;
				 JOptionPane.showMessageDialog(null, "O valor da área do trapézio resulta em " + area + " cm2/m2");
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
	}
	public static void calcPerimetro() {
		 while (true) {
			 try {
				 baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior: "));
				 baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor: "));
				 //lógica de entrada do usoário
				 if(baseMaior < baseMenor) {
					 JOptionPane.showMessageDialog(null, "A base maior deve ter um valor maior. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					 continue;
					 //mensagem de erro	caso a lógica n seja obedecida
				 }
				 else if(baseMaior == baseMenor) {
					 JOptionPane.showMessageDialog(null, "A base maior deve ter um valor maior. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					 continue;
				 }else {
					 ladoUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um dos lados: "));
					 ladoDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do outro lado: "));
					 perimetro = baseMaior + baseMenor + ladoUm + ladoDois;
					 JOptionPane.showMessageDialog(null, "cálculo: " + baseMaior +"+"+ baseMenor +"+"+ ladoUm +"+"+ ladoDois +"\nO valor do perímetro do trapézio resulta em " + perimetro + " cm/m");
					 break;
				 }
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
	}
	public static int chooseCalc(int chooseCalc) {
		 while (true) {
			 try {
				 chooseCalc  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o que deseja calcular do trapézio: \n[1] Area \n[2] Perímetro \n"));
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
		 return chooseCalc;
	}
}
