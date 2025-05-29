package app.adapters.order.entity;

import app.domain.models.Person;
import app.domain.models.HisClin;
import app.domain.models.Pet;
import app.domain.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long orderId;
    
    @Column(name = "pet")
    private Pet pet;
    
    @Column(name = "owner")
    private Person owner;
    
    @Column(name = "veterinarian")
    private User veterinarian;
    
    @Column(name = "medicationName")
    private HisClin medicationName;
    
    @Column(name = "creationDate")
    private String ceationDate;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public User getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(User veterinarian) {
		this.veterinarian = veterinarian;
	}

	public HisClin getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(HisClin medicationName) {
		this.medicationName = medicationName;
	}

	public String getCeationDate() {
		return ceationDate;
	}

	public void setCeationDate(String ceationDate) {
		this.ceationDate = ceationDate;
	}

}
