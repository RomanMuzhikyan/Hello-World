package am.aca.Shop.Repository.Implementations;

import am.aca.Shop.Repository.Interfaces.ProductRepository;
import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    private static ProductRepositoryImpl instance;
    private ProductRepositoryImpl(){

    }
    public static ProductRepositoryImpl getInstance(){
        if(instance==null){
            instance=new ProductRepositoryImpl();
        }
        return instance;
    }


    @Override
    public Product addProduct(Product product) throws InvalidCommandException {
        return null;
    }

    @Override
    public Product editProduct(Product product) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteProduct(Integer id) throws InvalidCommandException {

    }

    @Override
    public List<Product> getProduct() throws InvalidCommandException {
        return null;
    }

    @Override
    public Product totalPrice(Product id) throws InvalidCommandException {
        return null;
    }
}
