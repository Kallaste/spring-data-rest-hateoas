package com.techknowsurfer.springdatarest.repository;


import com.techknowsurfer.springdatarest.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long>{

}
