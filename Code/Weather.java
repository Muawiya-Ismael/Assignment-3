package Code;

import Code.Observer.WeatherObserver;

public interface Weather {
    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}
