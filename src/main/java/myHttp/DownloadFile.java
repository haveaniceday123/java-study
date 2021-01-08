package myHttp;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadFile {
  final String OUTPUT_FILE_PATH = "files/업무용승용차 운행기록부.xlsx";
  final String FILE_URL = "http://localhost:3000/static/car.xlsx";

  public void downloadFromURL() {
    try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())) {
      FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE_PATH);
      byte[] dataBuffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
        fileOutputStream.write(dataBuffer, 0, bytesRead);
      }

    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new DownloadFile().downloadFromURL();
  }

}
