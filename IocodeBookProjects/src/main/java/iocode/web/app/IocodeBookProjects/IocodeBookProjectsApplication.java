package iocode.web.app.IocodeBookProjects;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import iocode.web.app.Repository.BookRepository;
import iocode.web.app.entity.Book;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class IocodeBookProjectsApplication implements CommandLineRunner {
//	@Autowired
	private BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(IocodeBookProjectsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book book = new Book("Gotham City", "Jeremy Williams","2000", 250.00);
		bookRepo.save(book);
	}


}
