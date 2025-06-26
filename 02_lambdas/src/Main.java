import model.Auto;
import model.Mensajero;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        Mensajero lambdaMensaje = () -> { System.out.println("Hola desde Lambda"); };
        lambdaMensaje.mensaje(); //asociar el metodo a la implementacion que hicimos

        Auto mostrarModelo = (modelo -> { System.out.println("El modelo del auto es: " + modelo); });
        mostrarModelo.modeloAuto("Fiat Uno");

        Persona mostrarInfoPersona = (nombre, edad) -> {
            System.out.print("El nombre es: " + nombre + ", ");
            System.out.println("La edad es: " + edad);
        };
        mostrarInfoPersona.infoPersona("Mateo", 21);
    }
}