package com.vareli.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vareli.support.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("Select u from User u WHERE u.username=:username")
	User findByUsername(@Param("username") String username);
}
