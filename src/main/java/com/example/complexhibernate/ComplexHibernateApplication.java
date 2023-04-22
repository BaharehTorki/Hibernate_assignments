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
//			repository.save(new Friend("Robin", "Stockholm1", "077877777"));
//			repository.save(new Friend("Maria", "Stockholm2", "0755785456"));
//			repository.save(new Friend("Ida", "Stockholm3", "0767837746"));
//			repository.save(new Friend("Anna", "Stockholm4", "0734521202"));
//			repository.save(new Friend("David", "Stockholm5", "0735640565"));
//			repository.save(new Friend("Simon", "Stockholm6", "076421243"));
//			repository.save(new Friend("Emilie", "Stockholm7", "076745734"));
//			repository.save(new Friend("viliam", "Stockholm8", "076564335"));
		};
	}
}
