package com.mailorderpharma.authservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mailorderpharma.authservice.entity.UserData;


/**JPA Repository which interacts with database*/
@Repository
public interface UserDAO extends JpaRepository<UserData, String> {

}
