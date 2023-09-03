import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Interfaz {

    @FXML
    private Label Label_Confirmacion;

    @FXML
    private Button btn_Verificar;

    @FXML
    private TextArea txt_Desc;

    @FXML
    void handleButtonAction(ActionEvent event) {
        String palabra_Frase = txt_Desc.getText();

        String cadenaLimpia = limpiarCadena(palabra_Frase);

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
            Label_Confirmacion.setText("Es un Palindromo");
            Label_Confirmacion.setStyle("-fx-text-fill: green;");
            Label_Confirmacion.setAlignment(Pos.CENTER);
        } else {
            Label_Confirmacion.setText("No es un Palindromo");
            Label_Confirmacion.setStyle("-fx-text-fill: red;");
            Label_Confirmacion.setAlignment(Pos.CENTER);

        }

    }

    public static String limpiarCadena(String cadenaLimpia) {
        cadenaLimpia = cadenaLimpia.toLowerCase().replaceAll("[^a-z]+", " ");
        cadenaLimpia = cadenaLimpia.replace(" ", "");
        return cadenaLimpia;
    }

}
