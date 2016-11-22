package sample.Views;//

import javafx.beans.property.Property;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Controllers.LoginController;

import java.util.Observable;
import java.util.Properties;

//Created by DaMasterHam on 21-11-2016.
//
public class LoginView
{
    // Could be property/observable
    private TextField code;
    private Label codeLabel;
    private Button button;

    public LoginView(String label)
    {
        code = new TextField();
        codeLabel = new Label(label);
        button = new Button("Login");

    }

    public TextField getCode()
    {
        return code;
    }

    public Label getCodeLabel()
    {
        return codeLabel;
    }

    public Button getButton()
    {
        return button;
    }
}
