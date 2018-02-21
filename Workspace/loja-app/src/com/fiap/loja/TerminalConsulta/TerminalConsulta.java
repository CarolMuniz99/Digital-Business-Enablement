package com.fiap.loja.TerminalConsulta;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
/**
 * 
 * @author Caroline Muniz
 *
 */

public class TerminalConsulta {
	/**
	 * 
	 * Recebe um código do usuário e retorna a descrição do produto correspondente e a data atual.
	 */

	public static void main(String[] args) {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
		Calendar dataAtual  = Calendar.getInstance();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd/MM/yyyy");
		
		if (codigo == 401) {
			JOptionPane.showMessageDialog(null, "Descrição: Camiseta Masculina Manga Curta Branca \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		} else if(codigo == 402) {
			JOptionPane.showMessageDialog(null, "Descrição: Camiseta Feminina Manga Longa Rosa \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		} else {
			JOptionPane.showMessageDialog(null, "Descrição:  Produto Não Cadastrado! \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		}
	}

}
