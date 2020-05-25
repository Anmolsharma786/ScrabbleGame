import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WindowChanger {
    public void newWindow(String filename, String title, boolean resizable) throws Exception{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource(filename+".fxml"));
        stage.setTitle(title);
        //so that we cannot resize it.
        stage.setResizable(resizable);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
