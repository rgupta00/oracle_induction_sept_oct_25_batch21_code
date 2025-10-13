package com.hospitalmgtsystem.handler;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hospitalmgtsystem.event.PatientDischargeEvent;

@Component
public class BillingServiceHandler {

    @EventListener
    @Async
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }
}
