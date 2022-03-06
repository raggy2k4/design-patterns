package com.company.fasada;

public class DeliveryBoxFacade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade(DeliveryBox deliveryBox, DeliveryBoxSystem deliveryBoxSystem) {
        this.deliveryBox = deliveryBox;
        this.deliveryBoxSystem = deliveryBoxSystem;
    }

    public DeliveryBoxFacade() {
        deliveryBox = new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {
        deliveryBox.gerUserData();
        if (deliveryBoxSystem.isUserDataValidator() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
