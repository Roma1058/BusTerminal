package roman.kononenko.busterminal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import roman.kononenko.busterminal.dto.request.UserRequest;
import roman.kononenko.busterminal.entity.User;
import roman.kononenko.busterminal.repository.UserRepository;
import roman.kononenko.busterminal.security.JwtUser;

import java.io.Console;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void login(UserRequest userRequest){
        String login = userRequest.getLogin();
        String password = userRequest.getPassword();
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = findByLogin(login);
        JwtUser jwtUser = new JwtUser(user);

        return jwtUser;
    }

    private User findByLogin(String login)  {
        return userRepository.findByLogin(login);
    }
}
