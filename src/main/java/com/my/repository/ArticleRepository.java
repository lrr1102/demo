package com.my.repository;

import com.my.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {

    Article findByTitle(String title);

    Page<Article> findByType(String type, Pageable pageable);
}
