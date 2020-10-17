package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Get users list from apiService
     * @return
     */
    public List<User> getUsers() {
        return apiService.getUsers();
    }

    /**
     * Generate random user on users list on apiService
     */
    public void generateRandomUser() {
        apiService.generateRandomUser();
    }

    /**
     * Délete user from users list get on apiService
     * @param user
     */
    public void deleteUser(User user) {
        List<User> users = getUsers();
        User userToRemoove = null;
        for (User u: users){
            if (u.getId() == user.getId()) {
                userToRemoove = user;
            }
        }
        apiService.deleteUser(userToRemoove);
    }
}
