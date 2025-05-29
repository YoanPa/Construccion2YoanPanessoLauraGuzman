package app.ports;

import app.domain.models.HisClin;

public interface HisClinPort {
	boolean existHisClin (long hisclinId);
	public void saveHisClin(HisClin hisclin);
	public HisClin findByHisClin(long hisclinId);
}

