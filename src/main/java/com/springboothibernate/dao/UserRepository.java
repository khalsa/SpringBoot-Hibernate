package com.springboothibernate.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.springboothibernate.model.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
}
