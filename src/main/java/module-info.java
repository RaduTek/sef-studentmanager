module com.radutek.sefstudentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens loose.oose.fis.lab.student.manager to javafx.fxml;
    exports loose.oose.fis.lab.student.manager;

    opens loose.oose.fis.lab.student.manager.controllers to javafx.fxml;
    exports loose.oose.fis.lab.student.manager.controllers to javafx.fxml;
}