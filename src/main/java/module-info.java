module org.example.poolista3javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.poolista3javafx to javafx.fxml;
    exports org.example.poolista3javafx;
}