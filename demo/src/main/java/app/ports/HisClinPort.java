package app.ports;

import app.domain.models.HisClin;
import app.domain.models.Pet;
//talves aca toque poner la creacion y anulacion de order
public interface HisClinPort {
	public void saveHisClin(HisClin hisclin);
	public HisClin FindbyHisClin(HisClin hisclin);
	HisClin findByPetId(Pet pet);
	void save(HisClin hisClin);
}
/*
 * 
 */
