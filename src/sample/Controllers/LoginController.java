package sample.Controllers;

import sample.Models.UserModel;
import sample.Views.LoginView;

public class LoginController
{
    private LoginView view;
    private UserModel user;
    private AdminController controller;

    public LoginController(LoginView view, UserModel user)
    {
        this.view = view;
        this.user = user;
    }

    public void showLogin()
    {
        view.show();
    }

    public void login(String code)
    {
        user.getUserFromCode(code);

        if (user.getRole() == "Role1");

    }
}
