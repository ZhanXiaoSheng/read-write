package org.example.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhangsheng
 * Time 2023/11/3 10:48
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
