package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import banco.Conexao;
import entidade.Categoria;

public class DAOCategoria {

	public Categoria salvar(Categoria categoria) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPU");// objeto pesado, só tem 1
		// no sistema, só usar 1,
		// usar static VAI NO DAO

		try { // tente
			String conexao = Conexao.get();
			System.out.println("Gerenciador de transação");
			System.out.println("inicar transação");
			System.out.println("INSERT INTO CATEGORIA (...)...");
			System.out.println("CONFIRMAR transação");

			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally { // no final
			System.out.println("ENCERRAR transação");
		}
	}
}