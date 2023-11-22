package Code.Observer;

import Code.Observer.WeatherObserver;
import Code.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Weather {
    private List<WeatherObserver>observers=new ArrayList<WeatherObserver>();
    private float temperature;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer: observers){
            observer.update();
        }
    }

    public void setWeatherData(float temperature, float humidity ){
        this.temperature =temperature;
        this.humidity =humidity;
        notifyObservers();
    }

}
