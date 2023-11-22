package Code.Observer.Displayble;

import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class CurrentConditionsDisplay implements WeatherObserver {
    WeatherSubject weatherSubject ;
    float temperature;
    float humidity;

    public CurrentConditionsDisplay(WeatherSubject weatherSubject){
        this.weatherSubject = weatherSubject;
        weatherSubject.addObserver(this);
    }
    @Override
    public void update() {
        temperature = weatherSubject.getTemperature();
        humidity = weatherSubject.getHumidity();
        display();
    }

    public  void display(){
        System.out.println("Temperature: " + weatherSubject.getTemperature() + "C Humidity: " + weatherSubject.getHumidity());

    }
}
