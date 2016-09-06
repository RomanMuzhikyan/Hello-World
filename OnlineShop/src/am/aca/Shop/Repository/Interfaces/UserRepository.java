package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.User;

public interface UserRepository {
    User addUser(User user) throws InvalidCommandException;
    User editUser(User user)throws InvalidCommandException;
    void deleteUser(Integer id) throws InvalidCommandException;
    boolean verifyLogin(User user);

}
