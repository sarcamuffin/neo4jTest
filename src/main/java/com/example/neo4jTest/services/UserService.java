package com.example.neo4jTest.services;

import com.example.neo4jTest.entities.Profile;
import com.example.neo4jTest.entities.User;
import com.example.neo4jTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.login(username, password)) {
            // L'utilisateur est connecté avec succès
            return true;
        }
        return false;
    }

    public boolean createUser(String username, String password, Profile profile) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            return false; // Le nom d'utilisateur est déjà utilisé, la création du compte échoue
        }

        User user = new User(username, password, profile);
        userRepository.save(user);
        return true; // La création du compte est réussie
    }

}

