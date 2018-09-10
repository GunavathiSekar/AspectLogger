package com.kg.springboot1.repository;

import java.io.Serializable;

import com.kg.springboot1.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Serializable> {


}