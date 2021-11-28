package persistent;
import java.util.ArrayList;

import bean.*;

public interface TravelDao {
ArrayList<Travel> listAllBus();
ArrayList<Passenger> listAllPassenger();
boolean checkAvailability(String source,String destination);
int addPassenger(Passenger passenger);



}
