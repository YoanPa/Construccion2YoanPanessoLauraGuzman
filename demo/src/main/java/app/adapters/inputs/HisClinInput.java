package app.adapters.inputs;

import app.ports.InputPort;
import app.adapters.inputs.utils.Utils;
import org.springframework.stereotype.Component;

@Component
public class HisClinInput implements InputPort {

    private final String MENU = "Ingrese la opción:\n" +
            "1. Registrar historia clínica\n" +
            "2. Consultar historia clínica\n" +
            "3. Salir";

    @Override
    public void menu() throws Exception {
        while (true) {
            System.out.println(MENU);
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
        System.out.println("Funcionalidad para registrar historia clínica.");
        // Aquí va la lógica de registro
    }

    private void consultHistory() {
        System.out.println("Funcionalidad para consultar historia clínica.");
        // Aquí va la lógica de consulta
    }
}

