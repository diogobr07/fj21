package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("diogo");
		contato.setEmail("diogobruno@caelum.com.br");
		contato.setEndereco("Rua Vilela");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexao
		ContatoDAO dao = new ContatoDAO();
		dao.adciona(contato);
		System.out.println("Gravado!");

	}

}
