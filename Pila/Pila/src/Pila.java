public class Pila {
    private boolean isLlena = false;
    private boolean isVacio = true;
    private int top = -1;
    private char pila[];

    public Pila(int tamanio) {
        pila = new char[tamanio];
    }

    public char pop() {
        if(isVacio) { 
            System.out.println("La Pila Esta Vacia");
        }

        char elemento = pila[top];
        top--;
        if (top == -1) {
            isVacio = true;
        }
        isLlena = false;
        return elemento;
    }

    public void push(char c) {
        if (isLlena) {
            System.out.println("La Pila Esta Llena");
        }

        top++;
        pila[top] = c;
        isVacio = false;
        if (top == pila.length - 1) {
            isLlena = true;
        }

    }
}