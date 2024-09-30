//3. Музыкальный плеер (Song и Playlist):
//
//Song:
//Поля: title (String), artist (String), duration (double).
//Playlist:
//Поля: songs (List<Song>).
//Методы:
//addSong(Song song): добавляет песню в плейлист.
//play(): воспроизводит плейлист.
//Дополнительно: Реализуйте функцию перемешивания плейлиста.

public class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        setTitle(title);
        setArtist(artist);
        setDuration(duration);
    }

    public String toString() {
        return title + " by " + artist;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
