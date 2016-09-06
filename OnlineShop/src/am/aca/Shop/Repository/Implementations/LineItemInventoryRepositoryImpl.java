package am.aca.Shop.Repository.Implementations;

import am.aca.Shop.Repository.Interfaces.LineItemInventoryRepository;
import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Inventory;
import am.aca.Shop.comman.model.LineItem;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public class LineItemInventoryRepositoryImpl implements LineItemInventoryRepository {
    private static LineItemInventoryRepositoryImpl instance;
    private LineItemInventoryRepositoryImpl(){

    }
    public static LineItemInventoryRepositoryImpl getInstance(){
        if(instance==null){
            instance=new LineItemInventoryRepositoryImpl();
        }
        return instance;
    }

    @Override
    public Inventory quantityUpdater(Inventory inventory) throws InvalidCommandException {
        return null;
    }

    @Override
    public LineItem addSale(Product product) throws InvalidCommandException {
        return null;
    }

    @Override
    public List<Product> discountItems(Inventory sale) throws InvalidCommandException {
        return null;
    }
}
