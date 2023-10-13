package br.edu.runner;
import javax.swing.JOptionPane;

public class ChooseOption {
	// serve para criar as entradas e verificar se essas são válidas 
	public static int chooseOpt(int choose) {
		while(true) {
			try {
				choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de figura que deseja calcular: \n[1] Planas\n[2] Espaciais \n[3] Fechar Programa"));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choose;
	}
	public static int choosePlan(int choosePlanas) {
		while(true) {
			try {
				choosePlanas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a figura plana que deseja calcular: \n[1] Quadrado\n[2] Triângulo\n[3] Círculo\n[4] Retângulo\n[5] Trapézio \n[6] Losango \n[7] Voltar para as opções de figura\n[8] Fechar "));
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return choosePlanas;
	}
	public static int chooseEspac(int chooseEspac) {
		while(true) {
			try {
				chooseEspac = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a figura espacial que deseja calcular: \n[1] Cubo\n[2] Prisma\n[3] Pirâmide\n[4] Cilindro\n[5] Cone \n[6] Esfera\n[7] Voltar para as opções de figura\n[8] Fechar ")); 
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro na digitação. Tente novamente: ", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		return chooseEspac;
	}
}
