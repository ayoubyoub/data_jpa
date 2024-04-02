package com.rawan.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rawan.jpa.model.Author;
import com.rawan.jpa.repositories.AuthorRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
		return args ->{
			var author = Author.builder()
			.first_name("Ayoub")
			.last_name("Youb")
			.email("sis.ayoub.youb@gmail.com")
			.build();
			authorRepository.save(author);
		};
	}

}
