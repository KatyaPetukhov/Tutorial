package addimage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddImage extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Text title = new Text("California");
		title.setFont(Font.font("Verdana", FontWeight.BOLD,24 ));
		title.setFill(Color.FIREBRICK);
		Image img = new Image("addimage/California-calm.gif");
		ImageView pic = new ImageView(img);
		
		pane.setTop(title);
		pane.setCenter(pic);
		
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("California");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
