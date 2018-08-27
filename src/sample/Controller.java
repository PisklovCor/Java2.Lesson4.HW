package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextArea ChatArea;
    public TextField MessageField;
    public Button SendButton;




    public void SendMessage() {
        if (MessageField.getText() != null && !MessageField.getText().trim().isEmpty()) {
            ChatArea.appendText(MessageField.getText() + "\n");
        }
        MessageField.setText("");
        MessageField.requestFocus();
    }
}
