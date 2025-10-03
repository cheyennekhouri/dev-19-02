module com.example.dev1902 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dev1902 to javafx.fxml;
    exports com.example.dev1902;
}