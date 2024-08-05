package org.simp_blogApp.blogapp.repository;

import org.simp_blogApp.blogapp.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogUserRepository extends JpaRepository<BlogUser, Long> {

    Optional<BlogUser> findByUsername(String username);

}
