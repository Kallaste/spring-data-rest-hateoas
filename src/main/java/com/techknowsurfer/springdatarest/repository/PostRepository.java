package com.techknowsurfer.springdatarest.repository;

import com.techknowsurfer.springdatarest.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "blogs")
public interface PostRepository extends JpaRepository <Post,Long> {
}
