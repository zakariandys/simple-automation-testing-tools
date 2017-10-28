package com.automation.app.domain;

/**
 * Created by zakariandys on 28/10/17.
 */
public class Transaction {
    private String transactionId;
    private String addressShip;
    private String dateOrder;
    private String sellerName;
    private String deliveryService;

    public Transaction() {
    }

    public Transaction(String transactionId,
                       String addressShip,
                       String dateOrder,
                       String sellerName,
                       String deliveryService) {
        this.transactionId = transactionId;
        this.addressShip = addressShip;
        this.dateOrder = dateOrder;
        this.sellerName = sellerName;
        this.deliveryService = deliveryService;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAddressShip() {
        return addressShip;
    }

    public void setAddressShip(String addressShip) {
        this.addressShip = addressShip;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public String toString() {
        return "com.automation.app.Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", addressShip='" + addressShip + '\'' +
                ", dateOrder='" + dateOrder + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", deliveryService='" + deliveryService + '\'' +
                '}';
    }
}
