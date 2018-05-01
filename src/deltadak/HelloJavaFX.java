package deltadak;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Spinner;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Sample class to show JavaFX.
 */
public class HelloJavaFX extends Application {
    /** height */
    public final int height = 250;
    /** width */
    public final int width = 300;

    /**
     * Main method.
     * @param args Default
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 1+1");
        btn.setOnAction(event -> System.out.println(calculate()));

        Spinner spinner = new Spinner();

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(spinner);
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.show();
    }

    /**
     * Show 1+1.
     * @return 1+1
     */
    public int calculate() {
        return 1+1;
    }

    /**
     * Indicate something is loading.
     *
     * @param progressIndicator User wants feedback.
     *
     * @return Whether the progress was succesfully set.
     */
    public boolean isLoading(ProgressIndicator progressIndicator) {
        progressIndicator.setVisible(true);
        return true;
    }

}
