package roman.kononenko.busterminal.service;

import org.springframework.beans.factory.annotation.Autowired;
import roman.kononenko.busterminal.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;


}
