package com.company.fasada;

class DeliveryBox {

    boolean isDeliveryBoxFull() {
        System.out.println("Delivery Box is not full.");
        return false;
    }

   boolean isDeliveryBoxBroken() {
       System.out.println("Delivery Box is not broken.");
       return false;
   }

   void gerUserData() {
       System.out.println("User data entered");
   }

   void openBox() {
       System.out.println("Box opened");
   }
}
