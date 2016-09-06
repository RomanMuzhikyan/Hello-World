package am.aca.Shop.comman.model;

public class Inventory {
    private Integer quantity;
    private Boolean usedOrNot;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getUsedOrNot() {
        return usedOrNot;
    }

    public void setUsedOrNot(Boolean usedOrNot) {
        this.usedOrNot = usedOrNot;
    }
}
