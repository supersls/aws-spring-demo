package aws_demo.spring_boot_demo.controller;

import aws_demo.spring_boot_demo.model.Users;
import aws_demo.spring_boot_demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }


    @GetMapping("/users")
    public List<Users> listUsers() {
        return userRepository.findAll();
    }

}
