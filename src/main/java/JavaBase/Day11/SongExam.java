package JavaBase.Day11;

public class SongExam {
  public static void main(String[] args) {
    Song song = new Song();
    song.songTitle = "밤편지";
    song.singer = "아이유";
    song.albumName = "Palette";
    song.trackNumber = 8;

    System.out.println("[songTitle=" + song.songTitle + ","
        + "singer=" + song.singer + ", "
        + "albumName=" + song.albumName + ", "
        + "trackNumber=" + song.trackNumber + "]");

  }
}
