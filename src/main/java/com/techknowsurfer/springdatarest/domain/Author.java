package com.techknowsurfer.springdatarest.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@RestResource
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "author_id")
    Long authorId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @OneToMany(mappedBy = "postId", cascade = CascadeType.ALL)
    List<Post> post;

}
