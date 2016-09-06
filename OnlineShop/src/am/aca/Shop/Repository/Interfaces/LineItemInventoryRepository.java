package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Inventory;
import am.aca.Shop.comman.model.LineItem;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public interface LineItemInventoryRepository {
    Inventory quantityUpdater(Inventory inventory)throws InvalidCommandException;
    LineItem addSale(Product product) throws  InvalidCommandException;
    List<Product> discountItems(Inventory sale) throws  InvalidCommandException;
}
