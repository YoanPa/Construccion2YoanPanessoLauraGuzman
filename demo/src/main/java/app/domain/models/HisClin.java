package app.domain.models;

import java.sql.Date;

import app.adapters.person.entity.PersonEntity;
import app.adapters.pet.entity.PetEntity;

public class HisClin {
	private Date date;
    private User veterinarianId;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;
    private String procedure;
    private String medication;
    private String medicationDose;
    private Order orderId;
    private String vaccinationHistory;
    private String allergyMedications;
    private String procedureDetails;
    private boolean orderCanceled;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getVeterinarianId() {
		return veterinarianId;
	}
	public void setVeterinarianId(User veterinarianId) {
		this.veterinarianId = veterinarianId;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getConsultationReason() {
		return consultationReason;
	}
	public void setConsultationReason(String consultationReason) {
		this.consultationReason = consultationReason;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getMedicationDose() {
		return medicationDose;
	}
	public void setMedicationDose(String medicationDose) {
		this.medicationDose = medicationDose;
	}
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	public String getVaccinationHistory() {
		return vaccinationHistory;
	}
	public void setVaccinationHistory(String vaccinationHistory) {
		this.vaccinationHistory = vaccinationHistory;
	}
	public String getAllergyMedications() {
		return allergyMedications;
	}
	public void setAllergyMedications(String allergyMedications) {
		this.allergyMedications = allergyMedications;
	}
	public String getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(String procedureDetails) {
		this.procedureDetails = procedureDetails;
	}
	public boolean isOrderCanceled() {
		return orderCanceled;
	}
	public void setOrderCanceled(boolean orderCanceled) {
		this.orderCanceled = orderCanceled;
	}
	public void setHistoryId(Object historyId) {
		// TODO Auto-generated method stub
		
	}
	public Object getHistoryId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Pet getPet() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPet(PetEntity petAdapter) {
		// TODO Auto-generated method stub
		
	}
	public void setDescription(Object description) {
		
	}
	public void setVeterinarianId(PersonEntity personAdapter) {
		
		
	}
	
		
	
	
	}

<<<<<<< HEAD



=======
>>>>>>> 4f3d35ab791ee944f32e2c54b531579132375fa1
