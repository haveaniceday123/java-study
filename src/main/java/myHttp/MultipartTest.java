package myHttp;

import java.io.*;
import java.math.BigInteger;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MultipartTest {
  HttpClient httpClient;
  HttpRequest httpRequest;
  HttpResponse<String> httpResponse;
  public static final String ADDRESS= "http://localhost:3000";
  HashMap<Object, Object> map = new HashMap<>();


  public void multipartPost () throws IOException {
    Path path = Path.of("가르쳐줘 코딩 소녀_v1.5_apkpure.com.apk");
//    Path path = Path.of("HelloWorld.java");
    String uploadPath = ADDRESS + "/upload";
    BigInteger randomNumber = new BigInteger(256, new Random());
    StringBuilder boundary = new StringBuilder().append(randomNumber);

    map.put("id", "1");
    map.put("test", "this is test");
    map.put("test1", "this is test1");
    map.put("test2", "this is test2");
    map.put("test3", "this is test3");
    map.put("ttt", path);

    httpClient = HttpClient.newHttpClient();
    multipartToByte(map, boundary.toString());
//    System.out.println(multipartToByte(map, boundary.toString()));

    httpRequest = HttpRequest.newBuilder()
        .uri(URI.create(uploadPath))
        .setHeader("Accept-Language", "ko")
        .setHeader("Content-Type", "multipart/form-data; boundary=" + boundary)
        .PUT(multipartToByte(map, boundary.toString()))
        .build();

    try {
      HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
      System.out.println(response);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private HttpRequest.BodyPublisher multipartToByte (HashMap<Object, Object> map, String boundary) throws IOException {
    List<byte[]> byteArrays = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    for (Map.Entry<Object, Object> data : map.entrySet()) {
      System.out.println(stringBuilder);
      stringBuilder.setLength(0);
      stringBuilder.append("--").append(boundary).append("\r\n");

      if (data.getValue() instanceof Path) {
        Path filePath = (Path)data.getValue();
        String mimeType = Files.probeContentType(filePath);
        byte[] fileByte = Files.readAllBytes(filePath);

        stringBuilder.append("Content-Disposition: form-data; name=\"")
            .append(data.getKey())
            .append("\"; filename= \"")
            .append(data.getValue())
            .append("\"\r\n")
            .append("Content-Type: ")
            .append(mimeType)
            .append("\r\n\r\n");

        byteArrays.add(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        byteArrays.add(fileByte);
        byteArrays.add("\r\n".getBytes(StandardCharsets.UTF_8));
      } else {
        stringBuilder.append("Content-Disposition: form-data; name=\"")
            .append(data.getKey())
            .append("\";\r\n\r\n")
            .append(data.getValue())
            .append("\r\n");
        byteArrays.add(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
      }
    }

    stringBuilder.setLength(0);
    stringBuilder.append("--").append(boundary).append("--");
    byteArrays.add(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));

    return HttpRequest.BodyPublishers.ofByteArrays(byteArrays);
  }


  public static void main(String[] args) throws IOException {
    MultipartTest mt = new MultipartTest();
    mt.multipartPost();
  }


}
