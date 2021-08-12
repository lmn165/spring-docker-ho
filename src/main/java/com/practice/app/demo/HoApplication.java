package com.practice.app.demo;

import com.practice.app.demo.calculator.entity.User;
import com.practice.app.demo.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HoApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		userRepository.deleteAll();
		userRepository.save(new User("a", "dog", "a@", "123"));
		userRepository.save(new User("b", "cat", "b@", "123"));
		userRepository.save(new User("c", "cat", "c@", "123"));
		List<User> users = userRepository.findAll();
		System.out.println("전체 출력");
		for (User u : users){
			System.out.println(u.toString());
		}
		for (User u : userRepository.findAllByName("cat")){
			System.out.println(u.toString());
		}
	}
}