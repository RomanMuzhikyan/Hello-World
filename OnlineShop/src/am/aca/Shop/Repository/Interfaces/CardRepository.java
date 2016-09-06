package am.aca.Shop.Repository.Interfaces;

import am.aca.Shop.comman.exception.InvalidCommandException;
import am.aca.Shop.comman.model.Card;
import am.aca.Shop.comman.model.Order;
import am.aca.Shop.comman.model.Product;

import java.util.List;

public interface  CardRepository {
    Card addCard(Card card)throws InvalidCommandException;
    Card editCard(Card card) throws InvalidCommandException;
    void deleteCard(Integer id) throws InvalidCommandException;
    boolean hasBallance(Card card) throws InvalidCommandException;
    List<Order> shoppingItems(Product id)throws  InvalidCommandException;
    Card updateBallance(Order order) throws InvalidCommandException;
}
