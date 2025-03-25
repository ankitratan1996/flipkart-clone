package com.paymentservice.model.entity;

public enum PaymentStatus {

    IN_PROGRESS("In progress"),
    COMPLETED("Completed"),
    NOT_STARTED("Not Start");
    private String payment;

     PaymentStatus(String payment)
    {
        this.payment=payment;
    }

}
