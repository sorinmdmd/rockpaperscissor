package application;

import java.awt.image.ImagingOpException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class Controller {
	private int choice;

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}
	private TextField pas;
	
	
	public TextField getPas() {
		return pas;
	}

	public void setPas(TextField pas) {
		this.pas = pas;
	}
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label Text1;

	@FXML
	private Button button1;

	@FXML
	private Button button11;

	@FXML
	private Button button111;

	@FXML
	private Label result;

	Random random = new Random();

	private int comp;
	
	

	public void setComp(int comp) {
		this.comp = comp;
	}

	public int getComp() {
		return comp;
	}
    @FXML
    private Label comp_wahl;
	
    @FXML
    private ImageView imagine;
    
    @FXML
    private ImageView imagine2;

    @FXML
    private Label scorcomp;

    @FXML
    private Label scorpl;

    private int scorscomp = 0;
    
    private int scorspl = 0;

    @FXML 
    Label namepl;
    
    public Label getNamepl() {
		return namepl;
	}

	public void setNamepl(Label namepl) {
		this.namepl = namepl;
	}
	private String nameplString;
 
	public String getNameplString() {
		return nameplString;
	}

	public void setNameplString(String nameplString) {
		this.nameplString = nameplString;
		namepl.setText(nameplString); 
	}

	public int getScorscomp() {
		return scorscomp;
	}

	public void setScorscomp(int scorscomp) {
		this.scorscomp = scorscomp;
	}

	public int getScorspl() {
		return scorspl;
	}

	public void setScorspl(int scorspl) {
		this.scorspl = scorspl;
	}
	@FXML
	void initialize() {
		assert Text1 != null : "fx:id=\"Text1\" was not injected: check your FXML file 'testprog2.fxml'.";
		assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'testprog2.fxml'.";
		assert button11 != null : "fx:id=\"button11\" was not injected: check your FXML file 'testprog2.fxml'.";
		assert button111 != null : "fx:id=\"button111\" was not injected: check your FXML file 'testprog2.fxml'.";
		assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'testprog2.fxml'.";
		//setNameplString(getPas().getText());

		
	}
	@FXML
	void paper(ActionEvent event) {
		setComp(random.nextInt(3));
		if(getComp() == 0) {
			comp_wahl.setText("Computer spielt: Paper");
		}else if(getComp() == 1) {
			comp_wahl.setText("Computer spielt: Rock");
		}else {
			comp_wahl.setText("Computer spielt: Scissors");
		}
		setChoice(0);
		if (getChoice() == getComp()) {
			result.setText("DRAW");
			imagine.setVisible(false);
			imagine2.setVisible(false);
		}
		if (getComp() == 2) {
			result.setText("Du hast verloren");
			imagine2.setVisible(true);
			imagine.setVisible(false);
			setScorscomp(getScorscomp()+1);
			scorcomp.setText(getScorscomp()+"");
			
		}
		if (getComp() == 1) {
			result.setText("du hast gewonnen");
			imagine2.setVisible(false);
			imagine.setVisible(true);
			setScorspl(getScorspl()+1);
			scorpl.setText(getScorspl()+"");
		}
	}

	@FXML
	void rock(ActionEvent event) {
		setComp(random.nextInt(3));
		if(getComp() == 0) {
			comp_wahl.setText("Computer spielt: Paper");
		}else if(getComp() == 1) {
			comp_wahl.setText("Computer spielt: Rock");
		}else {
			comp_wahl.setText("Computer spielt: Scissors");
		}
		setChoice(1);
		if (getChoice() == comp) {
			result.setText("DRAW");
			imagine.setVisible(false);
			imagine2.setVisible(false);
		}
		if (getComp() == 2) {
			result.setText("Du hast gewonnen");
			imagine2.setVisible(false);
			imagine.setVisible(true);
			setScorspl(getScorspl()+1);
			scorpl.setText(getScorspl()+"");
		}
		if (getComp() == 0) {
			result.setText("Du hast verloren");
			imagine.setVisible(false);
			imagine2.setVisible(true);
			setScorscomp(getScorscomp()+1);
			scorcomp.setText(getScorscomp()+"");
		}
	}

	@FXML
	void scissors(ActionEvent event) {
		setComp(random.nextInt(3));
		if(getComp() == 0) {
			comp_wahl.setText("Computer spielt: Paper");
		}else if(getComp() == 1) {
			comp_wahl.setText("Computer spielt: Rock");
		}else {
			comp_wahl.setText("Computer spielt: Scissors");
		}
		setChoice(2);
		if (getChoice() == comp) {
			result.setText("DRAW");
			imagine.setVisible(false);			
			imagine2.setVisible(false);
		}
		if (getComp() == 1) {
			result.setText("Du hast verloren");
			imagine.setVisible(false);
			imagine2.setVisible(true);
			setScorscomp(getScorscomp()+1);
			scorcomp.setText(getScorscomp()+"");
		}
		if (getComp() == 2) {
			result.setText("du hast gewonnen");
			imagine.setVisible(true);
			imagine2.setVisible(false);
			setScorspl(getScorspl()+1);
			scorpl.setText(getScorspl()+"");
		}
	}
	@FXML
    void exit(ActionEvent event) {
		Platform.exit();
    }

	

}
