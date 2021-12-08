package up.mi.td06;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePane extends BorderPane {
	public DatePane() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Label lab = new Label(formatter.format(new Date()));
		Button button = new Button("Update");
		button.setOnAction(actionEvent -> lab.setText(formatter.format(new Date())));
		this.setCenter(lab);
		this.setBottom(button);
	}
}
