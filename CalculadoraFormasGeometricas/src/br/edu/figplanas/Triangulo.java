package br.edu.figplanas;

import javax.swing.JOptionPane;

public class Triangulo {
	 public static double base;
	 public static double altura;
	 public static double area;
	 public static double lado;
	 public static double ladoDois;
	 public static double ladoTres;
	 public static double perimetro;
	    
	 public Triangulo(){
		 base = 0;
		 altura = 0;
		 area = 0;
		 lado = 0;
		 ladoDois = 0;
		 ladoTres = 0;
		 perimetro = 0;
	 }
	 
	 public static void runnerTriangulo() {
		 int choose = 0, chooseCalc = 0;
		 while(true) {
			 // solicita a escolha de qual tipo de triângulo ele deseja calcular
			 choose = scannerEntrada(choose);
			 if (choose == 1) {
				 //após isso, solicita o que o usoário deseja calcular
				 chooseCalc  = scannerCalc(chooseCalc);
				if (chooseCalc == 1) {
					calcAreaEquilat();
					break;
				}
				else if(chooseCalc == 2) {
					calcEquilatPerimetro();
					break;
				}
				else if (chooseCalc == 3) {
					calcAlturaEquilat();
					break;
				}
				else {
					//mensagem de erro caso a opção escolhida não sejam válidas
					JOptionPane.showMessageDialog(null,"Opção inválida. Digite novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
			 }
			 else if (choose == 2) {
				 chooseCalc  = scannerCalcOutro(chooseCalc);
				if (chooseCalc == 1) {
					calcArea();
					break;
				}
				else if(chooseCalc == 2) {
					calcPerimetro();
					break;
				}
				else {
					JOptionPane.showMessageDialog(null,"Opção inválida. Digite novamente: ", null, JOptionPane.ERROR_MESSAGE);	
				}
			 }
			 else {
				 JOptionPane.showMessageDialog(null,"Opção inválida. Digite novamente: ", null, JOptionPane.ERROR_MESSAGE);	
			 }
		}
	}
	 public static void calcAreaEquilat() {
		 //calculo da area do equilatero
		 while(true) {
			 try {
				 lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				 area = (Math.pow(lado, 2) * Math.sqrt(3))/ 4;
				 JOptionPane.showMessageDialog(null, "O valor da área do triâgulo resulta em " + area  + " cm2/m2");
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 }
	 public static void calcArea(){
		 // padrão
		 while (true) {
			 try {
				 base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
				 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				 area = (base * altura) / 2;
				 JOptionPane.showMessageDialog(null, "O valor da área do triâgulo resulta em " + area  + " cm2/m2");
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
	}
	 public static void calcEquilatPerimetro(){
		 //cálculo do perímetro do equilátero 
		 while (true) {
			 try {
				 lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				 perimetro = lado * 3;
				 JOptionPane.showMessageDialog(null, "O valor do Perímetro do triâgulo resulta em " + perimetro  + " cm/m");	
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }		 
	 }
	 public static void calcPerimetro(){
		 //padrão
		 while (true) {
			 try {
				 lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro lado: "));
				 ladoDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo lado: "));
				 ladoTres = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro lado: "));
				 //condição de existência do triângulo
				 if(lado > (ladoDois + ladoTres)) {
					 JOptionPane.showMessageDialog(null, "Este triângulo não obedece a condição de existência. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					 continue;
				 }
				 else if(ladoDois > (lado + ladoTres)) {
					 JOptionPane.showMessageDialog(null, "Este triângulo não obedece a condição de existência. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					 continue;
				 }
				 else if(ladoTres > (lado + ladoDois)) {
					 JOptionPane.showMessageDialog(null, "Este triângulo não obedece a condição de existência. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
					 continue;
				 }
				 else{
					 perimetro = lado + ladoDois + ladoTres;
					 JOptionPane.showMessageDialog(null, "O valor do perímetro do triâgulo resulta em " + perimetro  + " cm/m");	
					 break;
				 }
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }		 
	 }
	 public static void calcAlturaEquilat() {
		 //cálculo da altura do equilátero
		 while(true) {	
			 try {
				 lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				 area = (lado * Math.sqrt(3))/ 2;
				 JOptionPane.showMessageDialog(null, "O valor da altura do triâgulo resulta em " + area  + " cm2/m2");
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 }
	 public static int scannerEntrada(int choose) {
		 //verificação de entrada
		 while (true) {
			 try {
				 choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de triângulo: \n[1] Equilátero \n[2] Outro"));
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
		 return choose;
	 }
	 public static int scannerCalc(int chooseCalc) {
		 //verificação de entrada
		 while (true) {
			 try {
				 chooseCalc  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o que deseja calcular do trângulo: \n[1] Area \n[2] Perímetro \n[3] Altura "));
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
		 return chooseCalc;
	 } 
	 public static int scannerCalcOutro(int chooseCalc) {
		 //verificação de entrada (mudança na mensagem)
		 while (true) {
			 try {
				 chooseCalc  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o que deseja calcular do trângulo: \n[1] Area \n[2] Perímetro "));
				 break;
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			 }
		 }
		 return chooseCalc;
	 } 
}