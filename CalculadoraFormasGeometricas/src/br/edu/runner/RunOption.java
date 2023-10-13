package br.edu.runner;
import javax.swing.JOptionPane;

import br.edu.figplanas.Circulo;
import br.edu.figplanas.Losango;
import br.edu.figplanas.Quadrado;
import br.edu.figplanas.Retangulo;
import br.edu.figplanas.Trapezio;
import br.edu.figplanas.Triangulo;

public class RunOption {
	// serve para controlar e processar as escolhas das figuras do usoário
	public static void runOne(){	
	
		int choosePlanas = 0;
		//cada opção que o usoário escolher chamará uma função de uma classe diferente
		while(true) {
			choosePlanas = ChooseOption.choosePlan(choosePlanas);
			if(choosePlanas == 1) {
				Quadrado.runnerQuadrado();
			}
			else if(choosePlanas == 2) {
				Triangulo.runnerTriangulo();		
			}
			else if(choosePlanas == 3) {
				Circulo.runnerCirculo();
			}
			else if(choosePlanas == 4) {
				Retangulo.runnerRetangulo();	
			}
			else if(choosePlanas == 5) {
				Trapezio.runnerTrapezio();
			}
			else if(choosePlanas == 6) {
				Losango.runnerLosango();
			}			
			else if(choosePlanas == 7) {
				Runner.runnerCode();
				break;
			}
			else if(choosePlanas == 8) {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Digite apenas opções válidas", null, JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}
	public static void runTwo() {
	
		int chooseEspac = 0;
		while(true) {								
			chooseEspac = ChooseOption.chooseEspac(chooseEspac);
			if(chooseEspac == 1) {
					
			}
			else if(chooseEspac == 2) {
				
			}
			else if(chooseEspac == 3) {
					
			}
			else if(chooseEspac == 4) {
					
			}
			else if(chooseEspac == 5) {
					
			}
			else if(chooseEspac == 6) {
					
			}
			else if(chooseEspac == 7) {
				Runner.runnerCode();
				break;
			}
			else if(chooseEspac == 8) {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
				break;
			}
			else{
				JOptionPane.showMessageDialog(null, "Digite apenas opções válidas", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}


