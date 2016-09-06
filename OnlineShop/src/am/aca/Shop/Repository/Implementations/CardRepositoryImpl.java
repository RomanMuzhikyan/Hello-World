package am.aca.Shop.Repository.Implementations;
import am.aca.Shop.Repository.Interfaces.CardRepository;
import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Card;
import am.aca.Shop.comman.model.Order;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public class CardRepositoryImpl implements CardRepository {
    private static CardRepositoryImpl instance;
    private CardRepositoryImpl(){

    }
    public static CardRepositoryImpl getInstance(){
        if(instance==null){
            instance=new CardRepositoryImpl();
        }
        return instance;
    }

    @Override
    public Card addCard(Card card) throws InvalidCommandException {
        return null;
    }

    @Override
    public Card editCard(Card card) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteCard(Integer id) throws InvalidCommandException {

    }

    @Override
    public boolean hasBallance(Card card) throws InvalidCommandException {
        return false;
    }

    @Override
    public List<Order> shoppingItems(Product id) throws InvalidCommandException {
        return null;
    }

    @Override
    public Card updateBallance(Order order) throws InvalidCommandException {
        return null;
    }
}
