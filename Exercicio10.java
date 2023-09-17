package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * Leitura de um array: Crie um programa que tente acessar um elemento em um
		 * array fora dos limites válidos. Use try para acessar o array e catch para
		 * lidar com a exceção de índice fora dos limites.
		 */

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite um número para preencher o array: "));
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		try {

			int recebe = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite um índice para selecionar um número da lista"));

			if (recebe >= 0 && recebe < numeros.length) {
				JOptionPane.showMessageDialog(null, "Você selecionou o índice " + recebe + ": " + numeros[recebe]);
			} else {
				JOptionPane.showMessageDialog(null, "O índice fornecido está fora dos limites do array.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido para o índice.");

		}

	}

}
