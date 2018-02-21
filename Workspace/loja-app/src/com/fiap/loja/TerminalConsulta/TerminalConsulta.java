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
	 * Recebe um c�digo do usu�rio e retorna a descri��o do produto correspondente e a data atual.
	 */

	public static void main(String[] args) {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto:"));
		Calendar dataAtual  = Calendar.getInstance();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd/MM/yyyy");
		
		if (codigo == 401) {
			JOptionPane.showMessageDialog(null, "Descri��o: Camiseta Masculina Manga Curta Branca \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		} else if(codigo == 402) {
			JOptionPane.showMessageDialog(null, "Descri��o: Camiseta Feminina Manga Longa Rosa \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		} else {
			JOptionPane.showMessageDialog(null, "Descri��o:  Produto N�o Cadastrado! \n"
					+ "Data atual: " + sdf.format(dataAtual.getTime()));
		}
	}

}
