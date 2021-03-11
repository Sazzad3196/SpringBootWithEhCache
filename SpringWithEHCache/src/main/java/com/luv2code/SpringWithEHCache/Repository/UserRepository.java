package com.luv2code.SpringWithEHCache.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.SpringWithEHCache.Entity.User;

public interface UserRepository extends JpaRepository<User , Integer> {

}
