module org.example.repos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.repos to javafx.fxml;
    exports org.example.repos;
}