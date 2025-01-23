module org.example.lambda_sreamapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lambda_sreamapi to javafx.fxml;
    exports org.example.lambda_sreamapi;
}