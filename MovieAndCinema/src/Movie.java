//13. Кинотеатр (Movie и Cinema):
//        - Movie:
//        - Поля: title (String), duration (int), genre (String).
//        - Cinema:
//        - Поля: movies (List<Movie>).
//        - Методы:
//        - addMovie(Movie movie): добавляет фильм в кинотеатр.
//        - showMovie(Movie movie): демонстрирует выбранный фильм.
//    - Дополнительно: Реализуйте расписание сеансов.

public class Movie {
    private String title;
    private int duration;
    private String genre;
    private int schedule;

    public Movie(String title, int duration, String genre, int schedule) {
        setTitle(title);
        setDuration(duration);
        setGenre(genre);
        setSchedule(schedule);
    }

    public String toString() {
        return title + " duration is " + duration + " genre is " + genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }
}
