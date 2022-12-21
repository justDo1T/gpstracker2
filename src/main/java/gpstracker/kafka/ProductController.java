//package gpstracker.kafka;
//
//import io.micronaut.http.HttpResponse;
//import io.micronaut.http.annotation.Body;
//import io.micronaut.http.annotation.Controller;
//import io.micronaut.http.annotation.Post;
//import jakarta.inject.Inject;
//
//@Controller("/kafka")
//public class ProductController {
//
//    @Inject
//    private ProductClient productClient;
//
//    @Post("/product")
//    public HttpResponse sendProduct(@Body String name) {
//        productClient.sendProduct("Nike", name);
//        return HttpResponse.ok();
//    }
//
//}
