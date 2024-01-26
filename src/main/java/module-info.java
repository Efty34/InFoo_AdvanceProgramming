module com.example.new_design {
    requires javafx.controls;
    requires javafx.fxml;
    //requires jfdata;
    requires java.sql;
    requires java.datatransfer;
    requires java.desktop;
    requires json.simple;


    opens com.example.new_design to javafx.fxml;
    exports com.example.new_design;
}