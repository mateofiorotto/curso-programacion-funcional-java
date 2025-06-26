import model.Operador;

public class Main {
    public static void main(String[] args) {

        //Resuelto con Func. Anonima
        Operador suma = new Operador(){
            @Override
            public int operar(int num1, int num2) {
                return num1+num2;
            }
        };

        System.out.println("Suma con clase anonima: " + suma.operar(2,2));

        //Resuelto con LAMBDA
        Operador suma2 = (num1,num2) -> num1+num2;
        System.out.println("Suma con lambda: " + suma2.operar(3,3));
    }
}