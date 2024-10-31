package dev.abdias.person_ff5;
import java.util.Date;

public final class App {
    private App() {
    }

        public static void main(String[] args) {
        Person abdias = new Person("Abdías", "Labrador", "Z26185465W",  new Date(1997, 5, 25));
        abdias.showInfo();
    }
}
