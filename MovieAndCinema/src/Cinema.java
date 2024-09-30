//13. Кинотеатр (Movie и Cinema):
//        - Movie:
//        - Поля: title (String), duration (int), genre (String).
//        - Cinema:
//        - Поля: movies (List<Movie>).
//        - Методы:
//        - addMovie(Movie movie): добавляет фильм в кинотеатр.
//        - showMovie(Movie movie): демонстрирует выбранный фильм.
//    - Дополнительно: Реализуйте расписание сеансов.

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Added " + movie.getTitle());
    }

    public void showMovie(Movie movie) {
        System.out.println(movie);
    }

    public void scheduleTime(Movie movie, int time) {
        System.out.println(movie.getTitle() + " at " + time + " and seanse is " + movie.getSchedule());
    }
}
