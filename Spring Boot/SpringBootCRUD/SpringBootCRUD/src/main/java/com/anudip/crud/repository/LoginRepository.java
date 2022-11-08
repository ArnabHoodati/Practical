package com.anudip.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anudip.crud.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByUserNameAndPassword(String userName, String password);

}
