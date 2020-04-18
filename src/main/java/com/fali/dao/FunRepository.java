package com.fali.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fali.model.Fun;
@Repository
public interface FunRepository extends CrudRepository<Fun, Integer>{

}
