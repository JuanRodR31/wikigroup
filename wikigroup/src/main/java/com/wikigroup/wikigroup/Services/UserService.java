package com.wikigroup.wikigroup.Services;


import com.wikigroup.wikigroup.Entities.User;
import com.wikigroup.wikigroup.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
