package myHttp;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Http {
    private HttpClient httpClient;
    private HttpRequest httpRequest;
    private HttpResponse<String> httpResponse;
    private URI uri;
    private URI uri2;
    private final static String address = "http://jsonplaceholder.typicode.com/posts/1";
    private final static String address2 = "http://jsonplaceholder.typicode.com/posts/2";
//    private final static URI uri = new URI("www.naver.com");
    static final String HTTP_CLASS_NAME = "HTTP CLASS";

    public String getName() {
        return HTTP_CLASS_NAME;
    }

    public void syncGet() throws URISyntaxException, IOException, InterruptedException {
        uri = new URI("http://jsonplaceholder.typicode.com/posts/2");

        httpClient = HttpClient.newBuilder().build();
        httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .timeout(Duration.ofMinutes(1))
                .header("Content-type", "application/json")
                .GET()
                .build();

        httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());

    }

    public void asyncGet() throws URISyntaxException {
        uri = new URI("http://jsonplaceholder.typicode.com/posts");

        try {

            httpClient = HttpClient.newBuilder().build();
            httpRequest = HttpRequest.newBuilder()
                            .uri(uri)
                            .timeout(Duration.ofMinutes(5))
                            .header("Content-type", "application/json")
                            .GET()
                            .build();


            httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                    .thenApply(response -> {

                        System.out.println(response);
                        return response;
                    })
                    .thenApply(HttpResponse::body)
                    .thenApply(test -> {
                        System.out.println("--------------------------------------------------");
                        System.out.println(test);
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        return "test";
                    })
                    .thenAccept(System.out::println).get()
            ;
//



        } catch (Exception e) {

        }


    }
}
