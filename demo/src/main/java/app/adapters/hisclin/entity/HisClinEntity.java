package app.adapters.hisclin.entity;

import app.domain.models.Order;
import app.domain.models.User;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "history_clinic")
@Getter
@Setter
@NoArgsConstructor
public class HisClinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "historiaclinica")
    private long hisclinId;
    
    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "veterianrianId")
    private User veterianrianId;

    @ManyToOne
    @JoinColumn(name = "consultationReason")
    private String consultationReason;

    @Column(name = "symptoms")
    private String symptons;

    @Column(name = "diagnosis")
    private String diagnosis;
    
    @Column(name = "procedure")
    private String procedure;

    @Column(name = "medication")
    private String medication;

    @Column(name = "medicationDose")
    private String medicationDose;

    @Column(name = "orderId")
    private Order orderId;

    @Column(name = "vaccinationHistory")
    private String vaccinationHistory;

    @Column(name = "allergyMedications")
    private String allergyMedications;

    @Column(name = "procedureDetails")
    private String procedureDetails;

    @Column(name = "orderCanceled")
    private boolean orderCanceled;

	
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

	public User getVeterianrianId() {
		return veterianrianId;
	}

	public void setVeterianrianId(User veterianrianId) {
		this.veterianrianId = veterianrianId;
	}

	public String getConsultationReason() {
		return consultationReason;
	}

	public void setConsultationReason(String consultationReason) {
		this.consultationReason = consultationReason;
	}

	public String getSymptons() {
		return symptons;
	}

	public void setSymptons(String symptons) {
		this.symptons = symptons;
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

}
