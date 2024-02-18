package iocode.web.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

//	public Book(String title, String author, String year, double price) {
//		this.title = title;
//		this.author = author;
//		this.year = year;
//		this.price = price;
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;
	private String title;
	@ManyToOne
	private Author author;
	private String year;
	private double price;

}
