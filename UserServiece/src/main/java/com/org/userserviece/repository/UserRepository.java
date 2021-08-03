package com.org.userserviece.repository;

import com.org.userserviece.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created with love by mundiaem
 * created on 28/07/2021
 * Time: 13:06
 * ⚡  - UserServiece
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(long userId);
}
