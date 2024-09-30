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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to the playlist.");
    }

    public void play() {
        System.out.println("Playing the playlist: ");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void shuffle() {
        Collections.shuffle(songs);
        System.out.println("Playlist shuffled.");
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
