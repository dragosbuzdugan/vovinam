package ro.vovinam.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.vovinam.logic.model.user.User;
import ro.vovinam.logic.repository.UserRepository;
import ro.vovinam.logic.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
