public class Inventario {
    private Articulo[] articulos;
    private int posicion = -1;

    public void add(String nombre, String codigo,  int precio) {
        posicion++;
        articulos[posicion].nombre = nombre;
        articulos[posicion].codigo = codigo;
        articulos[posicion].precio = precio;
    }
}
