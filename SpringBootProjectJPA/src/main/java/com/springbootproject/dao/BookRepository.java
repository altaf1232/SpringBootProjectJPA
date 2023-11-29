package com.springbootproject.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.entity.BookEntity;

@Repository
public interface BookRepository  extends CrudRepository<BookEntity, Integer>{
       //aager hame book key id  through nikala nahi hai tu ma yaha per eaak aaur method define karunag 
		/* public BookEntity findByeId(int id); */
}
