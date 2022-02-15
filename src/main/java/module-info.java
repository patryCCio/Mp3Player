module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;
    requires jid3lib;

    exports pl.patrickit.mp3player.main to javafx.graphics;
    opens pl.patrickit.mp3player.controller to javafx.fxml;
    opens pl.patrickit.mp3player.mp3 to javafx.base;
}