package com.example.jpacrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.jpacrud.entity.Ingredient;
import com.example.jpacrud.util.Measurement;

@SpringBootApplication
public class JpaassignmentApplication implements CommandLineRunner {

	@Autowired
	Ingredient ingredient;

	public static void main(String[] args) {
		SpringApplication.run(JpaassignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}
}