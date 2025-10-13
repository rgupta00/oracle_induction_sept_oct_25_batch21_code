package com.hospitalmgtsystem.handler;

import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    public void processBill(String patientId, String patientName) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient "
                +patientId+" : "+Thread.currentThread().getName());
    }
}
