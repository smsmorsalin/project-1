module main.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.project1 to javafx.fxml;
    exports main.project1;
}