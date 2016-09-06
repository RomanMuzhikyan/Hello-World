package am.aca.Shop.Repository.Implementations;
import am.aca.Shop.Repository.Interfaces.AddressRepository;
import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Address;

public class AddressRepositoryImpl implements AddressRepository {
    private static AddressRepositoryImpl instance;
    private AddressRepositoryImpl(){

    }
    public static AddressRepositoryImpl getInstance(){
        if(instance==null){
            instance=new AddressRepositoryImpl();
        }
        return instance;
    }

    @Override
    public Address addAddress(Address address) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteAddress(Integer id) throws InvalidCommandException {

    }

    @Override
    public Address editAddress(Address address) throws InvalidCommandException {
        return null;
    }

    @Override
    public boolean availableToThatCountry(Address country) throws InvalidCommandException {
        return false;
    }
}
