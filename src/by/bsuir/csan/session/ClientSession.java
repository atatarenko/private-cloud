package by.bsuir.csan.session;

import java.io.IOException;
import java.net.Socket;

public class ClientSession extends Session {

    public ClientSession(Socket socket) throws IOException {
        super(socket);
    }

    @Override
    protected void handleSession() throws IOException {
        String username = "user";
        String password = "pass";

        log(getResponse(SIGN_CMD + " " + username + " " + password), LogType.FROM);
        //log(getResponse(AUTH_CMD + " " + username + " " + password), LogType.FROM);
        //log(getResponse(CHECK_CMD), LogType.FROM);
        log(getResponse(QUIT_CMD), LogType.FROM);
        log("End of session"); //TODO debug
    }
}