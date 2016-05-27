package by.bsuir.csan.server.users;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private String passHash;
    private File userDir;

    public User(String login, String passHash) throws IOException {
        this.login = login;
        this.passHash = passHash;
        this.userDir = new File(UsersInfo.getUsersRootDir() + "/" + Integer.toString(login.hashCode()));
    }

    public String getLogin() {
        return login;
    }

    public String getPassHash() {
        return passHash;
    }

    public File getUserDir() {
        return userDir;
    }
}