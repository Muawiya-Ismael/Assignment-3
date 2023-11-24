package Code.Observer.Displayble;

import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class StatisticsDisplay implements WeatherObserver {
    private float temperatureSum;
    private float humiditySum;
    private int counter;
    private WeatherSubject weatherSubject;


    public StatisticsDisplay(WeatherSubject weatherSubject){
        this.weatherSubject =weatherSubject;
        weatherSubject.addObserver(this);
    }

    @Override
    public void update() {
        counter++;
        temperatureSum += weatherSubject.getTemperature();
        humiditySum += weatherSubject.getHumidity();
        display();
    }

    public  void display(){
        System.out.println("Average Temperature: "+temperatureSum/counter+"C Average Humidity: "+ humiditySum/counter);
    }
}
