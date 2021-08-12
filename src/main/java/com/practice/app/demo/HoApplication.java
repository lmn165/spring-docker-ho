package com.practice.app.demo;

import com.practice.app.demo.calculator.entity.Item;
import com.practice.app.demo.calculator.entity.User;
import com.practice.app.demo.calculator.repository.ItemRepository;
import com.practice.app.demo.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HoApplication implements CommandLineRunner{
	@Autowired	private UserRepository userRepository;
	@Autowired private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(HoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("############# Application Beginning #############");
		userRepository.deleteAll();
		userRepository.save(new User(1, "a", "dog", "a@", "123", new Date()));
		userRepository.save(new User(2, "b", "cat", "b@", "123", new Date()));
		userRepository.save(new User(3, "c", "cat", "c@", "123", new Date()));
		List<User> users = userRepository.findAll();
		System.out.println("전체 출력");
		for (User u : users){
			System.out.println(u.toString());
		}
		for (User u : userRepository.findAllByName("cat")){
			System.out.println(u.toString());
		}
		itemRepository.deleteAll();
		itemRepository.save(new Item(1, "갤럭시Z", 200, "신제품", new Date()));
		itemRepository.save(new Item(2, "노트북", 150, "지문인식", new Date()));
		itemRepository.save(new Item(3, "데스크탑", 100, "게이밍", new Date()));
		List<Item> items = itemRepository.findAll();
		for (Item u : items){
			System.out.println(u.toString());
		}
	}
}