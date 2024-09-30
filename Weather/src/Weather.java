//1Погодное приложение (Weather):
//
//Поля: temperature (double), humidity (double), pressure (double).
//Методы:
//updateWeather(double temp, double hum, double press): обновляет погодные данные.
//displayWeather(): отображает текущие погодные условия.
//Дополнительно: Реализуйте функцию предсказания погоды на основе данных.

public class Weather {
    private double temperature;
    private double pressure;
    private double humidity;

    public Weather updateWeather(double temp, double hum, double press) {
        Weather weather = new Weather();
        weather.setTemperature(temp);
        weather.setPressure(press);
        weather.setHumidity(hum);
        return weather;
    }

    public void displayWeather(Weather weather) {
        System.out.println("Current Weather Humidity:");
        System.out.println("Temperature: " + weather.getTemperature() + "°C");
        System.out.println("Humidity: " + weather.getHumidity() + "%");
        System.out.println("Pressure: " + weather.getPressure() + " hPa");
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}