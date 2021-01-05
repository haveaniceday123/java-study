package myHttp;

import java.io.*;
import java.math.BigInteger;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class MultipartTest {
  HttpClient httpClient;
  HttpRequest httpRequest;
  HttpResponse<String> httpResponse;
  public static final String ADDRESS= "http://hjyoun.ddns.net:19124";
  HashMap<Object, Object> map = new HashMap<>();


  public void multipartPost () throws IOException {
    Path path = Path.of("가르쳐줘 코딩 소녀_v1.5_apkpure.com.apk");
    BigInteger randomNumber = new BigInteger(256, new Random());
    StringBuilder boundary = new StringBuilder().append("--").append(randomNumber);

    map.put("id", "1");
    map.put("test", "this is test");
    map.put("file", path);

    httpClient = HttpClient.newHttpClient();
    multipartToByte(map, boundary.toString());
//    System.out.println(multipartToByte(map, boundary.toString()));

//    httpRequest = HttpRequest.newBuilder()
//        .uri(URI.create(ADDRESS))
//        .setHeader("Accept-Language", "ko")
//        .setHeader("Content-type", "multipart/form-data: boundary=" + boundary)
//        .PUT(multipartToByte(map, boundary))
//        .build();
  }

  private HttpRequest.BodyPublisher multipartToByte (HashMap<Object, Object> map, String boundary) throws IOException {
    List<byte[]> arrays = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    for (Map.Entry<Object, Object> entry : map.entrySet()) {
      // 이전값이 있다면 지우고 boundary 추가
      if (sb.length() != 0 ) {
//        sb.setLength(0);
        sb.append("\r\n\r\n").append(boundary).append("\r\n");
      }

      // value가 path 의 인스턴스일 경우
      if (entry.getValue() instanceof  Path) {
        sb.append("Content-Disposition: form-data; name=\"")
            .append(entry.getKey())
            .append("\" filename=\"")
            .append(((Path) entry.getValue()).getFileName())
            .append("\"\r\n")
            .append("Content-Type: form-data")
            .append("\r\n");

        arrays.add(String.valueOf(sb).getBytes(StandardCharsets.UTF_8));


        // make value
        File file = new File(String.valueOf(entry.getValue()));
        FileInputStream fileInput = new FileInputStream(file);
        for (byte b : fileInput.readAllBytes()) {
          sb.append(b);
        }
//        sb.append(fileI?nput.readAllBytes());
//        arrays.add(fileInput.readAllBytes());

        // value가 path의 인스턴스가 아닐경우
      } else {
        sb.append("Content-Disposition: form-data; name=\"")
            .append(entry.getKey())
            .append("\"\r\n\r\n")
            .append("")
            .append(entry.getValue());
      }
//      System.out.print(entry.getValue() instanceof Path);
    }

//    System.out.println(sb);
    System.out.println(String.valueOf(sb));

    return HttpRequest.BodyPublishers.ofString(String.valueOf(sb));
  }

  public static void main(String[] args) throws IOException {
    MultipartTest mt = new MultipartTest();
    mt.multipartPost();

  }


}
