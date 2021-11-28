package service;

import java.util.ArrayList;

import bean.*;

public interface TravelService {
boolean checkForBusAvailibility(String source,String destination);
ArrayList<Travel> listOfAllBus();
ArrayList<Passenger> listOfAllPassenger();
boolean addPassenger(Passenger passenger);
}
