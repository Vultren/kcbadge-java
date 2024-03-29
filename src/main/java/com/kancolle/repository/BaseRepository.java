package com.kancolle.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
	
	 void delete(T deleted);
	 
	 List<T> findAll();
	     
	 Optional<T> findOne(ID id);
	 
	 T save(T persisted);
	 
	 Long count();

	 List<T> findAll(Sort sort);
	 
	 Page<T> findAll(Pageable pageable);
	 
	 
}
