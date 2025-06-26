public class Main {
    public static void main(String[] args) {

        //implementamos animal sin "decir el nombre"
        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Guau");
            }
        };

        perro.hacerSonido();

        //

        //impelemntar otras clases, podemos tambien añadir atributos y metodos
        new Vehiculo(){
            private int numPasajeros;

            public void manejar(){
                System.out.println("Manejando");
            }
        }.manejar(); //llamamos al metodo acá, ya que al usar una clase y no haber override,
        // no lo "conoce" ya que la clase no tiene ese metodo
        //lo usamos tal y como si fuera un "objeto"

    }
}