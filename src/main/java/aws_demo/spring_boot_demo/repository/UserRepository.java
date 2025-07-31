package aws_demo.spring_boot_demo.repository;


import aws_demo.spring_boot_demo.model.Users;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Long> {
    @Query("SELECT * FROM users")
    List<Users> findAll();
}