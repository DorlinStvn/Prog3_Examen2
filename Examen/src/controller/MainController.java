package controller;

import java.io.File;
import java.lang.classfile.Label;
import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Visitante;
import javafx.scene.*;

public class MainController 
{
    @FXML
    private  TextField txtNombre;
    @FXML
    private TextField txtTipo;
    @FXML
    private ComboBoxLayoutManager combTipo;
    @FXML 
    private Button btnNuevoTipo;
    @FXML 
    private Button btnAgregarVisitante;
    @FXML 
    private Button btnGuardarVisitante;
    @FXML 
    private Button btnLimpiar;
    @FXML
    private ObservableList<Visitante> tblRegistro = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Visitante, String> columnNombre;
    @FXML
    private TableColumn<Visitante, String> columnTipo;

    @FXML
    private ProgressBar barraCarga;

    @FXML
    private Label lblEstado;

    
    private final String ARCHIVO = "visitantes.txt";


    @FXML
    public void initialize() 
    {

        columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnTipo.setCellValueFactory(new PropertyValueFactory<>("Tipo"));
    }

    @FXML
    private void btnAgregarVisitante(ActionEvent event) 
    {

        String nombre = txtNombre.getText().trim();
        String Tipo = txtTipo .getText().trim();

        
        if (nombre.isEmpty() || Tipo.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("El campo es obligatorio");
            alert.showAndWait();
            return;
        }
    }
    @FXML
    private void btnEliminarVisitante(Label label, int Text) {
        

        Visitante seleccionado = tblRegistro.getSelectionModel().getSelectedItem();

        if (seleccionado == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Selecciona un nombre para eliminar");
            alert.showAndWait();
            return;
        }

        Visitante.remove(seleccionado);
        label.setText("Visitante  eliminado");
    }

    @FXML
    private void cargarArchivo(Label label) {

       
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            label.setText("No existe Visitantes.txt");
            barraCarga.setProgress(0);
            return;
        }

        Thread hilo = new Thread(() -> {

            ObservableList<Visitante> temporal = FXCollections.observableArrayList();
        });

            Platform.runLater(() -> {
                barraCarga.setProgress(0);
                lblEstado.setText("Cargando...");
            });
    
    
        }
    


    
}

