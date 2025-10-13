package com.hospitalmgtsystem.handler;


import org.springframework.stereotype.Component;

@Component
public class MedicalRecordsServiceHandler {

    public void updatePatientHistory(String patientId, String patientName) {
        // Update medical records
        System.out.println("Medical Records Service: Updating records for patient "
                +patientId+" : "+Thread.currentThread().getName());
    }
}
