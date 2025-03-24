module com.radutek.sefstudentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radutek.sefstudentmanager to javafx.fxml;
    exports com.radutek.sefstudentmanager;
}