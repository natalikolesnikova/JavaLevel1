module com.example.javalevel1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javalevel1 to javafx.fxml;
    exports com.example.javalevel1;
}