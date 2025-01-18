package MapExtraPractice;

import java.util.HashMap;

public class CityPopulationTracker {
     private HashMap<String, City> cityPopulations;

     public CityPopulationTracker(){
        this.cityPopulations=new HashMap<>();
     }

     public City getCity(String name){
        City copy=new City(cityPopulations.get(name));
        return copy;
     }

     public void setCity(City newCity){
        this.cityPopulations.put(newCity.getName(),(new City(newCity)));
     }

     public void addCity(City newCity){
        City copy=new City(newCity);
        this.cityPopulations.put(newCity.getName(), copy);
     }
}
