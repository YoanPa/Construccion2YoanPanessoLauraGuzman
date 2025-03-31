package app.adapters.hisclin.entity;

import app.adapters.pet.entity.PetEntity;
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
		// TODO Auto-generated method stub
		return null;
	}
}
