package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.bean.UserBean;

public interface UserRepository extends JpaRepository<UserBean,Integer>{

}
