package com.waff.rest.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.waff.rest.demo.model.UserModel;

// Ist eine Schnittstelle zwischen meine Webseite und Datenbank

public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUserType(String user_type);
}
