package com.user.dao;

import java.util.List;

public interface UserDao<User> {
    
    User get(int id);
    
    List<User> getAll();
    
    void save(User user);
    
    void update(User user);
    
    void delete(User user);
}