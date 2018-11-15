package io.wiklandia.nnoo.io.wiklandia.nnoo.model;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T> extends CrudRepository<T, Long>, QuerydslPredicateExecutor<T> {
}
