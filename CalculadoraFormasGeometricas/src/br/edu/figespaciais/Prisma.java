package br.edu.figespaciais;
import javax.swing.JOptionPane;

public class Prisma {
	public static double volume;
	public static double areaBase;
	public static double areaLateral;
	public static double quantidadeLados;
	public static double ladoBase;
	public static double areaTotal;
	public static double diagonalPrisma;
	public static double largura;
	public static double altura;
	public static double comprimento;
	public static double perimetro;
	
	public Prisma() {
		volume = 0;
		areaBase = 0;
		quantidadeLados = 0;
		ladoBase = 0;
		areaTotal = 0;
		diagonalPrisma = 0;
		largura = 0;
		altura = 0;
		comprimento = 0;
		perimetro = 0;
	}
	public static void runnerPrisma(){
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
				calcPerimetro();
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcVolume() {
		while (true) {
			int choosePrisma = 0;
			try {
				choosePrisma = Integer.parseInt(JOptionPane.showInputDialog("Digite o prisma que deseja calcular o volume \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePrisma == 1) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = (Math.pow(ladoBase, 2) * Math.sqrt(3))/4;
				}
				else if(choosePrisma == 2) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = Math.pow(ladoBase, 2);
				}
				else if(choosePrisma == 3) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					areaBase = (6 * (Math.pow(ladoBase, 2) * Math.sqrt(3))) / 4;
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
				volume = areaBase * altura;
				JOptionPane.showMessageDialog(null, "O volume do prisma resulta em: "+ volume + " cm3/m3" );
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
				choosePrisma = Integer.parseInt(JOptionPane.showInputDialog("Digite o prisma que deseja calcular a área total \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePrisma == 1) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					areaLateral = altura * ladoBase;
					areaBase = (Math.pow(ladoBase, 2) * Math.sqrt(3))/4;
					quantidadeLados = 3;
				}
				else if(choosePrisma == 2) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					areaLateral = altura * ladoBase;
					areaBase = Math.pow(ladoBase, 2);
					quantidadeLados = 4;
				}
				else if(choosePrisma == 3) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					areaLateral = altura * ladoBase;
					areaBase = (6 * (Math.pow(ladoBase, 2) * Math.sqrt(3))) / 4;
					quantidadeLados = 6;
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				areaTotal = (areaBase * 2) + (quantidadeLados * areaLateral);
				JOptionPane.showMessageDialog(null, "A área total do prisma resulta em: "+ areaTotal + " cm3/m3" );
				break;
			}
			catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void calcPerimetro() {
		while (true) {
			int choosePrisma = 0;
			try {
				choosePrisma = Integer.parseInt(JOptionPane.showInputDialog("Digite o prisma que deseja calcular a área total \n[1] Triangular \n[2] Quadrangular \n[3] Hexagonal"));
				if(choosePrisma == 1) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					perimetro = (3 * altura) + (6*  ladoBase);
				}
				else if(choosePrisma == 2) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					perimetro = (4 * altura) + (8*  ladoBase);
				}
				else if(choosePrisma == 3) {
					ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado da base: "));
					altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
					perimetro = (6 * altura) + (12*  ladoBase);
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro na escolha da opção. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
				}
				JOptionPane.showMessageDialog(null, "O valor do perímetro do prisma resulta em: " + perimetro + " cm/m");
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
				choose = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja calcular: \n[1] Área Total\n[2] Volume\n[3] Perímetro"));
				break;
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
}
