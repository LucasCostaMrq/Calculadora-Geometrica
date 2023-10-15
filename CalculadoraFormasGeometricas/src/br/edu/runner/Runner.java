package br.edu.runner;
import javax.swing.JOptionPane;

public class Runner {
	public static void runnerCode() {
		// serve para controlar as escolhas do usóario sobre o tipo de figura que este irá escolher
		int choose = 0;				
		while(true) {
			
			choose = ChooseOption.chooseOpt(choose);
			if (choose == 1) {
				RunOption.runOne();
				break;
			}
			else if(choose == 2) {
				RunOption.runTwo();
				break;
			}
			else if(choose == 3) {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Digite apenas opções válidas", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}							
}