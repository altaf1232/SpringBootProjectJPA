package com.springbootproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springbootproject.dao.BookRepository;
import com.springbootproject.entity.BookEntity;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	 //here create method
	 //get all books 
	 public  List<BookEntity> getAllBooks()
	 {
		List<BookEntity> list=(List<BookEntity>) this.bookRepository.findAll();
		 return list;
	 }
	 //get single book by id
	 public BookEntity getAllBookById(int id)
	 {
		 //here i am using StreemAPI
		 BookEntity books=null;
		 try 
		 {
			 books= this.bookRepository.findById(id).get();
		 }
		 catch(Exception e) 
		 {
			e.printStackTrace();
		 }
		 return books;
	 }
	 //create method /adding the BookEntits
	 public BookEntity addTestBook(BookEntity booksTest) {
		 
		 return bookRepository.save(booksTest);
	 }   
	 // Delete Book handler 
     public  void deleteBook_b(int bId) {
	   bookRepository.deleteById(bId);
   }
     //here is create update method 
     public void updateBook(BookEntity bookEntityA, int book_id) {
    	 //here save aaur update dono eaak hi  work karte  hai 
    	 
    	 bookEntityA.setId(book_id);
    	 
    	 bookRepository.save(bookEntityA);
     }


}
  