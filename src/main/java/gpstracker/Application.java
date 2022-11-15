package gpstracker;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "GPS Tracker",
                version = "0.0",
                description = "API to communicate with TK-STAR GPS Trackers",
                contact = @Contact(name = "Adrian", email = "siewiera@gmail.com")
        )
)
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
