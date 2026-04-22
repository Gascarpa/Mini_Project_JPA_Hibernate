package aplicacao;

import Dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		/*
		//Adicionando pessoas no banco
		Pessoa p1 = new Pessoa(null, "Carlos da silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		*/
		//instanciando as entidades para fazer a operação.
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		/*
		//removendo dados
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		/*
		//procurando pessoa por ID
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		/*
		/*
		//fazendo as operações
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		System.out.println("Pronto!");
		em.close();
		enf.close();

	}

}
