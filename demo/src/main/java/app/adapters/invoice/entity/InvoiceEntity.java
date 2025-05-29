package app.adapters.invoice.entity;

import java.sql.Date;

import app.domain.models.Order;
import app.domain.models.Person;
import app.domain.models.Pet;
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
    
    @Column(name = "pet")
    private Pet pet;
    
    @Column(name = "owner")
    private Person owner;
    
    @Column(name = "order")
    private Order order;
    
    @Column(name = "productName")
    private String productName;
    
    @Column(name = "price")
    private long price;
    
    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "date")
    private Date date;

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
        
}
