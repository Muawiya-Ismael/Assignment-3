package Code.Decorator;

import Code.Decorator.WeatherSubjectDecorator;
import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class Precipitation extends WeatherSubjectDecorator{
    private String precipitation;
    public Precipitation(WeatherSubject weatherSubject) {
        super(weatherSubject);
        weatherSubject.addObserver(this);
    }

    @Override
    public void update() {
        if(precipitation != null){
            display();
        }
    }
    public void display(){
        System.out.println("Precipitation: "+this.precipitation);
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        update();
    }
}
