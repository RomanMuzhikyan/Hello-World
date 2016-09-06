package am.aca.Shop.comman.model;

public class LineItem {
    private Integer price;
    private Integer quantity;
    private Integer salesPrice;
    private Boolean saledOrNot;

    public Boolean getSaledOrNot() {
        return saledOrNot;
    }

    public void setSaledOrNot(Boolean saledOrNot) {
        this.saledOrNot = saledOrNot;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }


}
