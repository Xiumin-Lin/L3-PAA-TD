package up.mi.td06;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class CounterPane extends BorderPane {
	public CounterPane() {
		Label cpt = new Label("0");
		Button button = new Button("OK");
		button.setOnAction(actionEvent -> cpt.setText(String.valueOf(Integer.parseInt(cpt.getText()) + 1)));
		this.setCenter(cpt);
		this.setBottom(button);
	}
}
