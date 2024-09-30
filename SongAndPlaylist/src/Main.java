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


public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Shape of you", "Ed Sheeran", 3.5);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 4.2);
        Song song3 = new Song("Sweet but Psycho", "The Chainsmokers", 2.3);

        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.play();
        playlist.shuffle();
        playlist.play();
    }
}