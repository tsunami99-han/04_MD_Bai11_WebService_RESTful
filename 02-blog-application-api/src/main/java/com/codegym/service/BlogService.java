package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService extends GeneralService<Blog> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllOrOrderByDate(Pageable pageable);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    Iterable<Blog> findAllByCategory(Category category);
}
