package com.hospitalmgtsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.hospitalmgtsystem.event.PatientDischargeEvent;
import com.hospitalmgtsystem.handler.BillingServiceHandler;
import com.hospitalmgtsystem.handler.HousekeepingServiceHandler;
import com.hospitalmgtsystem.handler.MedicalRecordsServiceHandler;
import com.hospitalmgtsystem.handler.NotificationServiceHandler;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PatientDischargeService {

	@Autowired
	private BillingServiceHandler billingServiceHandler;
	@Autowired
	private HousekeepingServiceHandler housekeepingServiceHandler;
	@Autowired
	private MedicalRecordsServiceHandler medicalRecordsServiceHandler;
	
	@Autowired
	private NotificationServiceHandler notificationServiceHandler;
	
	
    public String dischargePatient(String patientId, String patientName) {

        log.info("patient discharge process initiated {} ", patientName);
        billingServiceHandler.processBill( patientId,  patientName);
        medicalRecordsServiceHandler.updatePatientHistory(patientId, patientName);
        
        housekeepingServiceHandler.cleanAndAssign(patientId, patientName);
        notificationServiceHandler.notifyPatients(patientId, patientName);

        log.info("patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";
    }
}
