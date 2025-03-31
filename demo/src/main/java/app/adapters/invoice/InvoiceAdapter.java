package app.adapters.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.invoice.entity.InvoiceEntity;
import app.adapters.invoice.repository.InvoiceRepository;
import app.domain.models.Invoice;
import app.ports.InvoicePort;

@Service
public class InvoiceAdapter implements InvoicePort {
    
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice findById(Long id) {
        InvoiceEntity invoiceEntity = invoiceRepository.findById(id);
        if (invoiceEntity == null) {
            return null;
        }
        return invoiceAdapter(invoiceEntity);
    }

    @Override
    public void save(Invoice invoice) {
        InvoiceEntity invoiceEntity = invoiceAdapter(invoice);
        invoiceRepository.save(invoiceEntity);
        invoice.setInvoiceId(invoiceEntity.getInvoiceId());
    }

    private InvoiceEntity invoiceAdapter(Invoice invoice) {
        InvoiceEntity invoiceEntity = new InvoiceEntity();
        invoiceEntity.setInvoiceId(invoice.getInvoiceId());
        invoiceEntity.setAmount(invoice.getAmount());
        invoiceEntity.setDate(invoice.getDate());
        return invoiceEntity;
    }

    private Invoice invoiceAdapter(InvoiceEntity invoiceEntity) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(invoiceEntity.getInvoiceId());
        invoice.setAmount(invoiceEntity.getAmount());
        invoice.setDate(invoiceEntity.getDate());
        return invoice;
    }
}
