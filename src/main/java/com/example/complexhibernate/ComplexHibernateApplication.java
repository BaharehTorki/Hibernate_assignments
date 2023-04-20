package com.example.complexhibernate;

import com.example.complexhibernate.assignment.models.Friend;
import com.example.complexhibernate.assignment.repos.FriendRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ComplexHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplexHibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FriendRepository repository){
		return (args) -> {
			repository.save(new Friend("Robin", "aaaaaa", "887877777"));
			repository.save(new Friend("Maria", "bbbbbbb", "0755785456"));
			repository.save(new Friend("Ida", "ccccccc", "67678346"));
			repository.save(new Friend("Anna", "ddddddddd", "743452122"));
			repository.save(new Friend("David", "fffffffff", "543564565"));
		};
	}
}
