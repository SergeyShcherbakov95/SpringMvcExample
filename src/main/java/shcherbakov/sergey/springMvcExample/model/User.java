package shcherbakov.sergey.springMvcExample.model;

/**
 *
 * @author sergey
 */
public class User {
    private String login;
    private String sex;
    
    public User(){
        //NOP
    }
    
    public  User(String login, String sex){
        this.login = login;
        this.sex = sex;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", sex=" + sex + '}';
    }
}
