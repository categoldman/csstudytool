package com.categ.csstudytool.repository;

import com.categ.csstudytool.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
