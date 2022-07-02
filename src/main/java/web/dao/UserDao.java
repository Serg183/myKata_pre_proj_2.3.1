package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> listUser();
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(Long id);

    public User getUserById(Long id);
}
