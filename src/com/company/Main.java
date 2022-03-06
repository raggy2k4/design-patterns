package com.company;

import com.company.fasada.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {
//            DocumentItem documentItem = DocumentItem.DocumentItemBuilder
//                    .aDocumentItem("Avengers", DocumentCategory.of("Fantasy"), List.of("PL123"))
//                    .build();
//            System.out.println(documentItem);

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}