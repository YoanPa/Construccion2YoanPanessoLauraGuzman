package app.domain.models;

import java.sql.Date;



public class HisClin {
	private long hisclinId;
	private Date date;
    private User veterinarianId;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;
    private String procedure;
    private String medicationName;
    private String medicationDose;
    private Order orderId;
    private String vaccinationHistory;
    private String allergyMedications;
    private String procedureDetails;
    private boolean orderCanceled;
    private Pet pet;
	public long getHisclinId() {
		return hisclinId;
	}
	public void setHisclinId(long hisclinId) {
		this.hisclinId = hisclinId;
	}
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
	public String getConsultationReason() {
		return consultationReason;
	}
	public void setConsultationReason(String consultationReason) {
		this.consultationReason = consultationReason;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
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
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
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
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
		
}




