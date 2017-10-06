package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public Envelope home() {
        return Envelope.envelope("Hällo Döcker World");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    static class Envelope {
        public String message;
        public LocalDate date = LocalDate.now();

        static Envelope envelope(String msg) {
            Envelope envelop = new Envelope();
            envelop.message = msg;
            return envelop;
        }
    }
}
