package am.aca.Shop.Repository.Implementations;

import am.aca.Shop.Repository.Interfaces.UserRepository;
import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.User;

public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl instance;

    private UserRepositoryImpl(){

    }
    public static UserRepositoryImpl getInstance(){
        if(instance==null){
            instance=new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public User addUser(User user) throws InvalidCommandException {
        return null;
    }

    @Override
    public User editUser(User user) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteUser(Integer id) throws InvalidCommandException {

    }

    @Override
    public boolean verifyLogin(User user) {
        return false;
    }
}
