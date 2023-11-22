package Code.Decorator.Children;

import Code.Observer.WeatherObserver;
import Code.Observer.WeatherSubject;

public class TemperatureUnit extends WeatherSubjectDecorator implements WeatherObserver {
    private float newTemperature;
    private String unit;
    public TemperatureUnit(WeatherSubject weatherSubject) {
        super(weatherSubject);
        weatherSubject.addObserver(this);

    }

    @Override
    public void update() {
        if(newTemperature !=0){
            display();
        }
    }

    public void setTemperatureUnit(TemperatureUnits temperatureUnits){
        if(temperatureUnits.equals(TemperatureUnits.FAHRENHEIT)){
           newTemperature=((weatherSubject.getTemperature()*9/5)+32);
           unit ="F";
        }
        else {
            newTemperature = weatherSubject.getTemperature();
            unit ="C";
        }
        update();
    }

    public void display(){
        System.out.println("Temperature: " + newTemperature + unit );
    }
}
