package iocode.web.app.IocodeBookProjects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import iocode.web.app.entity.Book;
import iocode.web.app.entity.BookRepository;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
//@RequiredArgsConstructor
@ComponentScan(basePackages = "iocode.web.app.entity")
public class IocodeBookProjectsApplication  {
//	@Autowired
//	private BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(IocodeBookProjectsApplication.class, args);
	}


}
