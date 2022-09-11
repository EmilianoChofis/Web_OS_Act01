package server;

import java.util.Arrays;

public class Methods {
    public String imc(String nombre, double peso, double altura){
        double imc;
        imc = peso / (altura*altura);
        String imcString = String.valueOf(imc);
        return "Hola" + " "+ nombre + " " +" tu imc es: " + imcString;
    }
    public String datos(Double num1, Double num2, Double num3, Double num4){
        Double producto = num1* num2* num3*num4;
        Double suma = num1 + num2+ num3+num4;
        Double prom = (num1 + num2+ num3+num4)/4;
        return "el producto es: " + producto +" la suma es: " +  suma + " el promedio es: " + prom;
    }
    public String sumaEntre(int num1, int num2){
        int suma = 0;
        for (int i=num1+1; i < num2; i++){
            suma = suma+i;
        }
        return "suma de los valores entre "+ num1 +" y "+num2 +" es igual a "+ suma;
    }

    public String orden(int num1, int num2, int num3, int num4, int num5){
        int [] numeros = {num1, num2, num3, num4, num5};
        Arrays.sort(numeros);
        String mensaje= Arrays.toString(numeros);
        return mensaje;
    }
}
