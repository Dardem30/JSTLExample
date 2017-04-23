/**
 * Created by УВД on 21.04.2017.
 */
public class User {
    String login;
    String password;

    public User(String login, String password) {
        this.password=password;
        this.login=login;
    }

    public void setLogin(String login){
        this.login=login;
    }
    public String getLogin(){
        return login;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
