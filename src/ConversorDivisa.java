import java.util.Scanner;

public class ConversorDivisa{

    public static void Convertir(String divisaReferencial, String divisaTarget, ConsultaDivisas consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;


        Divisas divisas = consulta.buscarDivisas(divisaReferencial, divisaTarget);
        System.out.println("La conversion de hoy\n1 "+divisaReferencial+ " = "+divisas.conversion_rate()+ " "+divisaTarget);
        System.out.println("Ingrese la cantidad de " + divisaReferencial);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * divisas.conversion_rate();
        System.out.println(cantidad+" "+divisaReferencial +" = " +cantidadConvertida + " " + divisas.target_code());

    }

    public static <consultaDivisas> void convertirOtraDivisa(consultaDivisas consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base:*");
        String divisaReferencial = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda ***");
        String divisaObjetivo = lectura.nextLine().toUpperCase();
        Convertir(divisaReferencial, divisaObjetivo, (ConsultaDivisas) consulta, lectura);
    }
}