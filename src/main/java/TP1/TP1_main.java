package TP1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TP1_main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TP1_main.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * EntityManagerFactory entityManagerFactory =
		 * Persistence.createEntityManagerFactory("rappels-jpa"); EntityManager
		 * entityManager = entityManagerFactory.createEntityManager();
		 * 
		 * ExempleTest test = new ExempleTest("Hello World !");
		 * 
		 * entityManager.persist(test);
		 */

	}

}
