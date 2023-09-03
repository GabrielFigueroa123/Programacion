import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-///- ¿ES UN PALINDROMO? -///-");
        String palabra_Frase = teclado.nextLine();

        String cadenaLimpia = limpiarCadena(palabra_Frase);

        System.out.println(cadenaLimpia);

        Pila pila = new Pila(cadenaLimpia.length());

        for (int i = 0; i < cadenaLimpia.length(); i++) {
            char caracter = cadenaLimpia.charAt(i);
            pila.push(caracter);
        }

        char caracteres[] = new char[cadenaLimpia.length()];

        for (int i = 0; i < cadenaLimpia.length(); i++) {
            caracteres[i] = pila.pop();

        }
        
        String cadenaInvertida = String.valueOf(caracteres);

        if (cadenaLimpia.equals(cadenaInvertida)) {
            System.out.println("Es un Palindromo");
        } else {
            System.out.println("No es un Palindromo");
        }

    }

    public static String limpiarCadena(String cadenaLimpia) {
        cadenaLimpia = cadenaLimpia.toLowerCase().replaceAll("[^a-z]+", " ");
        cadenaLimpia = cadenaLimpia.replace(" ", "");
        return cadenaLimpia;
    }
}
