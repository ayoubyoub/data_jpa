package com.rawan.jpa;

import com.rawan.jpa.model.Author;
import com.rawan.jpa.model.Video;
import com.rawan.jpa.repositories.AuthorRepository;
import com.rawan.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(
    AuthorRepository authorRepository,
    VideoRepository videoRepository
  ) {
    return args -> {
      var author = Author
        .builder()
        .first_name("Ayoub")
        .last_name("Youb")
        .email("sis.ayoub.youb@gmail.com")
        .build();
      authorRepository.save(author);
      var video = Video.builder().name("abc").length("5").build();
      videoRepository.save(video);
    };
  }
}
