//1Погодное приложение (Weather):
//
//Поля: temperature (double), humidity (double), pressure (double).
//Методы:
//updateWeather(double temp, double hum, double press): обновляет погодные данные.
//displayWeather(): отображает текущие погодные условия.
//Дополнительно: Реализуйте функцию предсказания погоды на основе данных.

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Weather weather1 = weather.updateWeather(1, 2, 3);
        weather.displayWeather(weather1);
    }
}

