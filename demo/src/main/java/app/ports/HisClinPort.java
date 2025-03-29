package app.ports;

import app.domain.models.HisClin;
//talves aca toque poner la creacion y anulacion de order
public interface HisClinPort {
	public void saveHisClin(HisClin hisclin);
	public HisClin FindbyHisClin(HisClin hisclin);
}
/*
 * 
 */
