package org.example.service;

import org.example.entity.User;
import org.example.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author zhangsheng
 * Time 2023/11/3 10:50
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(transactionManager = "masterTransactionManager")
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional(transactionManager = "slaveTransactionManager", readOnly = true)
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}

