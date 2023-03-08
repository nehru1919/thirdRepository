package com.nt;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dao.UserRepository;
import com.nt.entities.User;

@SpringBootApplication
public class SpringDataJpa03Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataJpa03Application.class, args);
		UserRepository userRepository=ctx.getBean(UserRepository.class);
		// create object for single user
//		User user=new User();
//		user.setName("nehru");
//		user.setCity("hyderabad");
//		user.setStatus("I am Java Programmer");
	
//	
		//update
		Optional<User> optional=userRepository.findById(1);
		User user=optional.get();
		
		user.setName("vijay");
		User result=userRepository.save(user);
		
		System.out.println(user);

}
}