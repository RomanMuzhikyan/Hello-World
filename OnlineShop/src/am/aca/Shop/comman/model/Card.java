package am.aca.Shop.comman.model;

public class Card {
    private Integer cardID;
    CardType cardType;
    Integer myBallance;

    public Integer getMyBallance() {
        return myBallance;
    }

    public void setMyBallance(Integer myBallance) {
        this.myBallance = myBallance;
    }

    public Integer getCardID() {
        return cardID;
    }

    public void setCardID(Integer cardID) {
        this.cardID = cardID;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
