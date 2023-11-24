# Assignment-3 <br>
![Screenshot 2023-11-23 125453](https://github.com/Muawiya-Ismael/Assignment-3/assets/116707240/9c974ea0-72ef-4c97-8c97-2f8aec94fe31)
<br>
## Observer Package
Observer saction is responsible for updating data each time get set up  for all the classes that uses Subject what happened that we in this assignment want an why to create weather display system that display data we choose in a way we choose so to get that I do this:<br><br>

```WeatherObserver``` class that had ```update method``` that is going to update data each time a new data get set.
```WeatherSubject``` class is going to allow use to creat an object that has a list of __WeatherObserver__ object so this class is help us in the way we want to display data so if you want to display data in any why you want, you simply can do that by crating a new class that implements __WeatherObserver__ class to get update methode and add it into __WeatheObserver__ List int __WeatherSubject__ object so ```CurrentConditionsDisplay``` and ```StatisticsDisplay``` these two classes simply do what i just explain and thay have display method that get could each time update method work. 

## Decorate Package
here Decorate design will help us with the ability to add now whys to display data whys or add new typs off data to display simply by crating ```WeatherSubjectDecorator``` that impliment __ Weather__  interface like ```WeatherSubject``` so it get same behavior, what it dose is create a why to communication between new behavior with ```WeatherSubject``` ```WhatherObserver``` classes. <br>
```WeatherSubjectDecorator``` it implements __ Weather__ , __ WeatherObserver__  and initialize a object of __ WeatherSubject__  and get it value using it constructor and implements __ WeatherObserver__  using __ WeatherSubject__  object like this 
- ```weatherSubject.addObserver(weatherObserver)```
- ```weatherSubject.removeObserver(weatherObserver)```
- ```weatherSubject.notifyObservers()```
So by using __ WeatherSubjectDecorator__  we can add new behavior by get inherited from it and overrride update function and pass __ WeatherSupject__  object in contructor using super functions 
