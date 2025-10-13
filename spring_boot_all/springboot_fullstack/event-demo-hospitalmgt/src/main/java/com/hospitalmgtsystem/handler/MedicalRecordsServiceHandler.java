package com.hospitalmgtsystem.handler;


import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hospitalmgtsystem.event.PatientDischargeEvent;

@Component
public class MedicalRecordsServiceHandler {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent event) {
        // Update medical records
        System.out.println("Medical Records Service: Updating records for patient "
                +event.getPatientId()+" : "+Thread.currentThread().getName());
    }
}
