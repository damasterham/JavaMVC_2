package sample.Models;//

//Created by DaMasterHam on 21-11-2016.
//
public class UserModel
{
    private String name;
    private String role;
    private String code;

    public UserModel()
    {
    }

    public UserModel(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void getUserFromCode(String code)
    {
        // Acces a db and find user with code.
        if (code == "1")
        {
            setName("Test1");
            setRole("Role1");
        }
    }
}
