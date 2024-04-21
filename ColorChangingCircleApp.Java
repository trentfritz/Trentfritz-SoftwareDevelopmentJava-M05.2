import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorChangingCircle extends Application {
    
    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        circle = new Circle(100, Color.WHITE);
        
        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.WHITE);
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);
        
        Scene scene = new Scene(root, 200, 200);
        
        primaryStage.setTitle("Color Changing Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
