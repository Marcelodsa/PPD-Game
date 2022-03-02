module com.example.tsoroyematatu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tsoroyematatu to javafx.fxml;
    exports com.example.tsoroyematatu;
}