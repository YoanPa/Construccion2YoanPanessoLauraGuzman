package app.domain.models;

import app.adapters.person.entity.PersonEntity;

public class Pet {
	private long petId;
	private String petname;
	private PersonEntity owner;
	private int age;
	private String species;
	private String breed;
	private String characteristics;
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
	public void setOwner(PersonEntity personEntity) {
		this.owner = personEntity;
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
		// TODO Auto-generated method stub
		
	}
	
	
}