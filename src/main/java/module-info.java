module com.myprojects.tic_tac_toe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.myprojects.tic_tac_toe to javafx.fxml;
    exports com.myprojects.tic_tac_toe;
}