import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisas consulta = new ConsultaDivisas();

        int opccion = 0;
        while (opccion != 9){
            System.out.println("""
                    ******************************************
                    Sean Bienvenidos a este Conversor de Divisas\s

                    Ingresa el monto que deseas convertir

                    1. Dolar a Sol Peruano
                    2. Peso Argentino a Dolar
                    3. Dolar a Real Brasileño
                    4. Peso Mexicano a Dolar
                    5. Dolar a Euro
                    6. Yuan a Dolar
                    7. Peso Chileno a Soles
                    8. Convertir otra Divisa
                    9. Salir""");

            opccion = lectura.nextInt();
            lectura.nextLine();

            switch (opccion){
                case 1:
                    ConversorDivisa.Convertir("USD", "PEN", consulta, lectura);
                    break;
                case 2:
                        ConversorDivisa.Convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConversorDivisa.Convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConversorDivisa.Convertir("MXN", "USD", consulta, lectura);
                    break;
                case 5:
                    ConversorDivisa.Convertir("USD", "EUR", consulta, lectura);
                    break;
                case 6:
                    ConversorDivisa.Convertir("CNY", "USD", consulta, lectura);
                    break;
                case 7:
                    ConversorDivisa.Convertir("CLP", "PEN", consulta, lectura);
                    break;
                case 8:
                    ConversorDivisa.convertirOtraDivisa(consulta, lectura);
                    break;
                case 9:
                    System.out.println("Saliendo ....");
                    break;


                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }



    }
}
