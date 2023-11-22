package Code.Decorator;

import Code.Weather;
import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class WeatherSubjectDecorator implements Weather {
    WeatherSubject weatherSubject;

    public WeatherSubjectDecorator(WeatherSubject weatherSubject){
        this.weatherSubject = weatherSubject;
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherSubject.addObserver(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherSubject.addObserver(weatherObserver);
    }

    @Override
    public void notifyObservers() {
        weatherSubject.notifyObservers();
    }


}
