package am.aca.Shop.comman.model;

import java.util.Currency;

public class Order {
    private Integer orederID;
    private String dateCreated;
    private String dateShipped;
    private String orderName;
    private Double itemPrice;
    private Double shippingPrice;
    private Double totalPrice;
    private Boolean trackingNumber;

    public Boolean getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Boolean trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    Address shipTo;


    public Address getShipTo() {
        return shipTo;
    }

    public void setShipTo(Address shipTo) {
        this.shipTo = shipTo;
    }




    public Integer getOrederID() {
        return orederID;
    }

    public void setOrederID(Integer orederID) {
        this.orederID = orederID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orederID=" + orederID +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateShipped='" + dateShipped + '\'' +
                ", orderName='" + orderName + '\'' +
                ", itemPrice=" + itemPrice +
                ", shippingPrice=" + shippingPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
