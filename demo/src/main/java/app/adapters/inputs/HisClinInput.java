package app.adapters.inputs;

import app.ports.InputPort;
import app.ports.HisClinPort;
import app.adapters.inputs.utils.Utils;
import app.domain.models.HisClin;
import org.springframework.stereotype.Component;

@Component
public class HisClinInput {
    
    private final HisClinPort hisClinPort;

    public HisClinInput(HisClinPort hisClinPort) {
        this.hisClinPort = hisClinPort;
    }

    public void menu() {
        while (true) {
            System.out.println("Ingrese la opción:\n1. Registrar historia clínica\n2. Consultar historia clínica\n3. Salir");
            String option = Utils.getReader().nextLine();
            switch (option) {
                case "1":
                    registerHistory();
                    break;
                case "2":
                    consultHistory();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    private void registerHistory() {
        try {
            System.out.println("Ingrese el ID de la mascota:");
            long petId = Long.parseLong(Utils.getReader().nextLine());

            System.out.println("Ingrese la descripción del historial:");
            String description = Utils.getReader().nextLine();

            HisClin hisClin = new HisClin();
            hisClin.setPetId(petId);
            hisClin.setDescription(description);

            hisClinPort.save(hisClin);
            System.out.println("Historia clínica registrada con éxito.");
        } catch (Exception e) {
            System.out.println("Error al registrar la historia clínica: " + e.getMessage());
        }
    }

    private void consultHistory() {
        try {
            System.out.println("Ingrese el ID de la mascota:");
            long petId = Long.parseLong(Utils.getReader().nextLine());

            HisClin history = hisClinPort.findByPetId(petId);

            if (history != null) {
                System.out.println("Historia clínica encontrada: " + history.getDescription());
            } else {
                System.out.println("No se encontró historia clínica para esta mascota.");
            }
        } catch (Exception e) {
            System.out.println("Error al consultar la historia clínica: " + e.getMessage());
        }
    }
}

