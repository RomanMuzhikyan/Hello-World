package am.aca.Shop.comman.model;

public enum CardType {
    MASTER(1),
    VISA(2),
    MAESTRO(3);
    private Integer ID;
    CardType(int ID) {
        this.ID = ID;
    }
}
