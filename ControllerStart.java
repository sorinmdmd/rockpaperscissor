package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerStart {
	private static String deinenam;
	
	
    public static String getDeinenam() {
		return deinenam;
	}

	public void setDeinenam(String deinenam) {
		this.deinenam = deinenam;
	}
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button start;
    
    @FXML
    private TextField name;
    
    @FXML
    void startpr(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("testprog2.fxml"));
        Parent root = loader.load();

        // Get the controller associated with the loaded FXML
        Controller controller = loader.getController();

        // Pass the TextField from ControllerStart to Controller
        String depus = name.getText();
        // Pass the name to the controller
        controller.setNameplString(depus);

        Stage stage = (Stage) start.getScene().getWindow();
        stage.setTitle("Spiel");
        stage.setScene(new Scene(root));
    }
   
    
    @FXML
    void nameeingabe(ActionEvent event) {
    	
    }

    @FXML
    void initialize() {
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'start.fxml'.";
       

    }

}
