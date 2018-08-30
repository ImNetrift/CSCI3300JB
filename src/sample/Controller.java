package sample;
import java.awt.*;
import javafx.*;
import javax.swing.*;

public class Controller {
    @FXML
    TextField email, username, password;

    public void touchLogin(ActionEvent actionEvent) {

        Model model = new Model();
        String hashPassword = model.generatePasswordHash(password.getText());
        System.out.print(hashPassword);

    }
}
