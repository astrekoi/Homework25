package org.example;

public class User {

    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {}

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
