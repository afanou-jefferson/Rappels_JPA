package TP3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // Annotation Spring pour autoriser la gestion des transactions
public class TP3_main {

	public static void main(String[] args) {
		SpringApplication.run(TP3_main.class, args);
	}


}
