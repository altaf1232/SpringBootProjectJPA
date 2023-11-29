package com.springbootproject.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Writer_Book")
public class BookEntity {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="book_id")
	private int id;
	private String name;
	private String titel;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookEntity(int id, String name, String titel, String author) {
		super();
		this.id = id;
		this.name = name;
		this.titel = titel;
		this.author = author;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", titel=" + titel + ", author=" + author + "]";
	}
	

}
