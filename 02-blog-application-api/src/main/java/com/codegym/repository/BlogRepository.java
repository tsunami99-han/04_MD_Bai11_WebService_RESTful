package com.codegym.repository;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    @Query("select b from Blog b order by b.date asc ")
    Page<Blog> findAllOrOrderByDate(Pageable pageable);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    Iterable<Blog> findAllByCategory(Category category);
}
