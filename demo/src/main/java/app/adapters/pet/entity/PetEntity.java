package app.adapters.pet.entity;

import app.adapters.person.entity.PersonEntity;
import app.domain.models.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet")
public class PetEntity {
	@Id
	@Column(name = "id")
	private long petId;
	@Column(name = "petname")
	private String petname;
	@Column(name = "owner")
	private PersonEntity owner;
	@Column(name = "age")
	private int age;
	@Column(name = "species")
	private String species;
	@Column(name = "breed")
	private String breed;
	@Column(name = "characteristics")
	private String characteristics;
	@Column(name = "weight")
	private long weight;
	public long getPetId() {
		return petId;
	}
	public void setPetId(long petId) {
		this.petId = petId;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public PersonEntity getOwner() {
		return owner;
	}
	public void setOwner(PersonEntity owner) {
		this.owner = owner;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public void setOwner(Person personAdapter) {
			
	}
	
}
