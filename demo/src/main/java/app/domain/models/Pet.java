package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Pet {
	private long petId;
	private String petname;
	private String humanId;
	private int age;
	private String species;
	private String breed;
	private String characteristics;
	private float weight;
	
	public long getpetId() {
		return petId;
	}
	public void setpetId(long petId) {
		this.petId = petId;
	}
	public String getpetname() {
		return petname;
	}
	public void setpetname(String petname) {
		this.petname = petname;
	}
	public String gethumanId() {
		return humanId;
	}
	public void sethumanId(String humanId) {
		this.humanId = humanId;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getspecies() {
		return species;
	}
	public void setspecies(String species) {
		this.species = species;
	}
	public String getbreed() {
		return breed;
	}
	public void setbreed(String breed) {
		this.breed = breed;
	}
	public String getcharacteristics() {
		return characteristics;
	}
	public void setcharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public float getweight( ) {
		return weight;
	}
	public void setweight(float weight) {
		this.weight = weight;
	}

}
