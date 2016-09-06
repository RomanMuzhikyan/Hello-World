package am.aca.Shop.comman.model;


public enum TypeNumber {
    HOME(1),
    MOBILE(2);
    private int ID;

    private int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    TypeNumber(int ID) {
        this.ID = ID;

    }
}
