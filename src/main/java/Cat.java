/**
 * Created by УВД on 21.04.2017.
 */
public class Cat {
    String name;
    String age;
public Cat(){

}
    public Cat(String login, String password) {
        this.name=login;
        this.age=password;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return age;
    }
}
