package Code.Decorator;

import Code.Decorator.WeatherSubjectDecorator;
import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class WindSpeed extends WeatherSubjectDecorator  {
    private float windSpeed;

    public WindSpeed(WeatherSubject weatherSubject) {
        super(weatherSubject);
        weatherSubject.addObserver(this);
    }

    @Override
    public void update() {
        if(windSpeed != 0){
            display();
        }
    }
    public void display(){
        System.out.println("Wind Speed: "+this.windSpeed);
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
        update();
    }
}
