package com.company.fasada;

public class DeliveryBoxSystem {
    public  void sendNotification() {
        System.out.println("Text message sent to the client.");
    }

    public boolean isPaymentSecured() {
        System.out.println("User data has been validated");
        return true;
    }

    public boolean isUserDataValidator() {
        System.out.println("User data has been validated");
        return true;
    }

    public void scheduleDelivery() {
        System.out.println("Delivery has been scheduled");
    }
}
