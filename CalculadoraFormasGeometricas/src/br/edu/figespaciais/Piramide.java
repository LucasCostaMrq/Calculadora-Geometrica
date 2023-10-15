package br.edu.figespaciais;

import javax.swing.JOptionPane;

public class Piramide {
	public static double altura;
	public static double ladoBase;
	public static double volume;
	public static double areaTotal;
	public static double areaBase;
	public static double apotemaBase;
	public static double areaLateral;
	public static double alturaLado;
	public static double quantidadeLados;
	
	public Piramide() {
		altura = 0;
		ladoBase = 0;
		volume = 0;
		areaTotal = 0;
		areaBase = 0;
		apotemaBase = 0;
		areaLateral = 0;
		alturaLado = 0;
		quantidadeLados = 0;
	}
	public static void runnerPiramide() {
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
				calcAreaTotal();
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcVolume() {
		while (true) {
			int choosePiram = 0;
			try {
				choosePiram = Integer.parseInt(JOptionPane.showInputDialog("Digite a pirâmide que deseja calcular o volume: \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePiram == 1) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = (Math.pow(ladoBase, 2) * Math.sqrt(3))/4;
				}
				else if(choosePiram == 2) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = Math.pow(ladoBase, 2);
				}
				else if(choosePiram == 3) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = (6 * (Math.pow(ladoBase, 2) * Math.sqrt(3))) / 4;
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				volume = 0.33*(areaBase * altura);
				JOptionPane.showMessageDialog(null, "O volume da pirâmide resulta em: "+ volume + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaTotal() {
		while (true) {
			int choosePrisma = 0;
			try {
				choosePrisma = Integer.parseInt(JOptionPane.showInputDialog("Digite a pirâmide que deseja calcular a área total: \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePrisma == 1) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					
					apotemaBase = altura * 0.33;
					areaBase = (Math.pow(ladoBase,2) * Math.sqrt(3))/4;
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;
					quantidadeLados = 3;
				}
				else if(choosePrisma == 2) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					
					apotemaBase = ladoBase / 2;
					areaBase = ladoBase * ladoBase;
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;
					quantidadeLados = 4;
				}
				else if(choosePrisma == 3) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					
					apotemaBase = (ladoBase * Math.sqrt(3))/2;					
					areaBase = (6*(Math.pow(ladoBase,2) * Math.sqrt(3)))/4;
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;
					quantidadeLados = 6;
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				areaTotal = areaBase + (quantidadeLados * areaLateral);
				JOptionPane.showMessageDialog(null, "A área total da pirâmide resulta em: "+ areaTotal + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcAreaLateral() {
		while (true) {
			int choosePrisma = 0;
			try {
				choosePrisma = Integer.parseInt(JOptionPane.showInputDialog("Digite a pirâmide que deseja calcular a área lateral: \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePrisma == 1) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					apotemaBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do apótema da base: "));
					
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;
				}
				else if(choosePrisma == 2) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					apotemaBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do apótema da base: "));
					
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;					
				}
				else if(choosePrisma == 3) {
					
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					apotemaBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do apótema da base: "));
					
					alturaLado = Math.sqrt(Math.pow(altura,2) + Math.pow(apotemaBase, 2));
					areaLateral = (ladoBase * alturaLado)/2;					
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "O valor da área lateral da pirâmide resulta em: "+ areaLateral + " cm2/m2" );
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
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Área Total\n[2] Volume\n[3] Área Lateral"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}

