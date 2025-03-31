package app.adapters.hisclin.entity;

import app.adapters.pet.entity.PetEntity;
import app.domain.models.Person;
import app.domain.models.Pet;

import java.sql.Date;

import app.adapters.person.entity.PersonEntity;
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
    @Column(name = "history_id")
    private long historyId;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetEntity pet;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    private PersonEntity veterinarian;

    @Column(name = "date")
    private String date;

    @Column(name = "description", length = 500)
    private String description;

	public Object getHistoryId() {
		return null;
	}

	public void setHistoryId(Object historyId2) {
		
	}

	public void setPet(PetEntity petAdapter) {
		
	}

	public void setVeterinarian(PersonEntity personAdapter) {
		
	}

	public void setDate(Date date2) {
		
	}

	public void setDescription(Object description2) {
		
	}

	public Pet getPet() {
		return null;
	}

	public Person getVeterinarianId() {
		return null;
	}

	public Object getDescription() {
		
		return null;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}



}
