package app.adapters.inputs;

import app.ports.InvoicePort;
import app.adapters.inputs.utils.Utils;
import app.domain.models.Invoice;
import org.springframework.stereotype.Component;

@Component
public class InvoiceInput {

    private final InvoicePort invoicePort;

    public InvoiceInput(InvoicePort invoicePort) {
        this.invoicePort = invoicePort;
    }

    public void menu() {
        while (true) {
            System.out.println("Ingrese la opción:\n1. Registrar factura\n2. Consultar factura\n3. Salir");
            String option = Utils.getReader().nextLine();
            switch (option) {
                case "1":
                    registerInvoice();
                    break;
                case "2":
                    consultInvoice();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    private void registerInvoice() {
        try {
            System.out.println("Ingrese el ID del cliente:");
            long clientId = Long.parseLong(Utils.getReader().nextLine());

            System.out.println("Ingrese el monto total:");
            double totalAmount = Double.parseDouble(Utils.getReader().nextLine());

            Invoice invoice = new Invoice();
            invoice.setClientId(clientId);
            invoice.setTotalAmount(totalAmount);

            invoicePort.save(invoice);
            System.out.println("Factura registrada con éxito.");
        } catch (Exception e) {
            System.out.println("Error al registrar la factura: " + e.getMessage());
        }
    }

    private void consultInvoice() {
        try {
            System.out.println("Ingrese el ID de la factura:");
            long invoiceId = Long.parseLong(Utils.getReader().nextLine());

            Invoice invoice = invoicePort.findById(invoiceId);

            if (invoice != null) {
                System.out.println("Factura encontrada: Monto = " + invoice.getTotalAmount());
            } else {
                System.out.println("No se encontró la factura.");
            }
        } catch (Exception e) {
            System.out.println("Error al consultar la factura: " + e.getMessage());
        }
    }
}
