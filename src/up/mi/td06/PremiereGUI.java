package up.mi.td06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PremiereGUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("GUI_inutile");
//		BorderPane pane = new CounterPane();
		BorderPane datePane = new DatePane();

		Scene scene = new Scene(datePane);
		stage.setScene(scene);
		stage.sizeToScene();

		stage.show();
	}
}
