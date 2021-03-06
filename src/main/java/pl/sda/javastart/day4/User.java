package pl.sda.javastart.day4;

import java.util.Objects;

public class User {
private String name;
private String login;
private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
               // ", password='"  + '\'' +
                '}';
    }

  //  @Override
    //public boolean equals(Object o) {
      //  return super.equals(o);
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login);
    }
}
