package com.techknowsurfer.springdatarest.domain;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@RestResource
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "post_id")
    Long postId;

    @Column(name = "content")
    String content;

    @Column(name = "article_title")
    String articleTitle;

    @Column(name = "status")
    Boolean status;

    @Column(name = "author_id")
    String authorId;
}
