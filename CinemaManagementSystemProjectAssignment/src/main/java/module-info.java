module org.example.cinemamanagementsystemprojectassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cinemamanagementsystemprojectassignment to javafx.fxml;
    exports org.example.cinemamanagementsystemprojectassignment;
}