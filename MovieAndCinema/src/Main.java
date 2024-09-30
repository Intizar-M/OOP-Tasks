//13. Кинотеатр (Movie и Cinema):
//        - Movie:
//        - Поля: title (String), duration (int), genre (String).
//        - Cinema:
//        - Поля: movies (List<Movie>).
//        - Методы:
//        - addMovie(Movie movie): добавляет фильм в кинотеатр.
//        - showMovie(Movie movie): демонстрирует выбранный фильм.
//    - Дополнительно: Реализуйте расписание сеансов.



public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Дюймовочка", 2, "мультфильм", 1);
        Movie movie2 = new Movie("Иллюзия обмана", 1, "фентези", 2);
        Movie movie3 = new Movie("Гарри Поттер", 3, "фантастика", 3);

        Cinema cinema = new Cinema();

        cinema.addMovie(movie1);
        cinema.addMovie(movie2);
        cinema.addMovie(movie3);

        cinema.showMovie(movie1);
        cinema.showMovie(movie2);
        cinema.showMovie(movie3);

        cinema.scheduleTime(movie2, 2);
        cinema.scheduleTime(movie3, 4);
    }
}