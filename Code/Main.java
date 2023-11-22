package Code;

import Code.Decorator.Precipitation;
import Code.Decorator.Children.TemperatureUnit;
import Code.Decorator.Children.TemperatureUnits;
import Code.Decorator.Children.WindSpeed;
import Code.Observer.Displayble.CurrentConditionsDisplay;
import Code.Observer.Displayble.StatisticsDisplay;
import Code.Observer.WeatherSubject;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherSubject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherSubject);

        WindSpeed windSpeed = new WindSpeed(weatherSubject);
        Precipitation precipitation = new Precipitation(weatherSubject);
        TemperatureUnit temperatureUnit = new TemperatureUnit(weatherSubject);

        weatherSubject.setWeatherData(14,23);
        windSpeed.setWindSpeed(20);
        precipitation.setPrecipitation("raining");
        temperatureUnit.setTemperatureUnit(TemperatureUnits.FAHRENHEIT);

        weatherSubject.removeObserver(windSpeed);
        weatherSubject.removeObserver(precipitation);
        weatherSubject.removeObserver(temperatureUnit);


        weatherSubject.setWeatherData(29,30);

    }
}
