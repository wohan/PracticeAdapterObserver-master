package models;

/**
 * Created by PoGo on 20.04.2017.
 */
public class User {

    private Integer id;
    private String login;
    private String passw;
    private boolean isBlocked;

    public User(Integer id, String login, String passw, boolean isBlocked) {
        this.id = id;
        this.login = login;
        this.passw = passw;
        this.isBlocked = isBlocked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
