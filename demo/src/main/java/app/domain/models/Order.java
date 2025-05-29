package app.domain.models;

public class Order {
	private long orderId;
    private Pet pet;
    private Person owner;
    private User veterinarian;
    private HisClin medicationName;
    private String creationDate;
    
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
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}


}
