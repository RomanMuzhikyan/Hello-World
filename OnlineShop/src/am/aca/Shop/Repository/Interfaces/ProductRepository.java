package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public interface ProductRepository {
    Product addProduct(Product product) throws  InvalidCommandException;
    Product editProduct(Product product) throws  InvalidCommandException;
    void deleteProduct(Integer id) throws  InvalidCommandException;
    List<Product> getProduct()throws InvalidCommandException; // inch piti tam :/
    Product totalPrice(Product id) throws InvalidCommandException;
    Product infoProduct(Integer id)throws InvalidCommandException;

}
