package com.wikigroup.wikigroup.Repositories;

import com.wikigroup.wikigroup.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}