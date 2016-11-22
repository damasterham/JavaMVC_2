package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Controllers.LoginController;
import sample.Models.UserModel;
import sample.Views.LoginView;

public class Main extends Application
{
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;

        LoginController login;

        UserModel user;

        LoginView loginView = new LoginView("Code");
        loginView.getButton().setOnAction(e ->
            login.login(loginView.getCode().getText())
        );

        user = new UserModel();;
        login  = new LoginController(loginView, user);

        login.showLogin();

        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
