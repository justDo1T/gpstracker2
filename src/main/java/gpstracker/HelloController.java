package gpstracker;

import gpstracker.kafka.ProductClient;
import io.micronaut.context.ApplicationContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld() {
        return "Hello World";
    }

    @Post
    public String sendToKafka() {
        ApplicationContext context = ApplicationContext.run();
        ProductClient client = context.getBean(ProductClient.class);
        client.sendProduct("Nike", "Blue Trainers");
        return "xD";
    }

}
