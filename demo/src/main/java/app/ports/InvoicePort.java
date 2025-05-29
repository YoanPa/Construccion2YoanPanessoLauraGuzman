package app.ports;

import app.domain.models.Invoice;

public interface InvoicePort {

	boolean existInvoice (long invoiceId);
	
	public void saveInvoice (Invoice invoice);
	
	public Invoice findByInvoiceId (long invoiceId);
}
