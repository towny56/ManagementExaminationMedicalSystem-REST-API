package com.fixit.dao;

import com.fixit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);

    User findByEmail(String email);

    User findByEgn(String egn);
}
