package app.adapters.invoice.entity;

import app.adapters.person.entity.PersonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice")
public class InvoiceEntity {
    @Id
    @Column(name = "id")
    private long invoiceId;
    
    @Column(name = "client")
    private PersonEntity client;
    
    @Column(name = "date")
    private String date;
    
    @Column(name = "total")
    private double total;
    
    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public PersonEntity getClient() {
        return client;
    }

    public void setClient(PersonEntity client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
