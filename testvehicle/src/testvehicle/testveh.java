package testvehicle;
import static org.junit.Assert.*;

import org.junit.Test;

import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Person;
import vehicle.Truck;



public class testveh {

	@Test
	public void test() {
	
	
	Person a = new Person();
   	 a.setFirstName("a");
   	 Car NewCar= new Car();
   	 NewCar.setOwner(a);
   	 NewCar.setNumberOfDoors(4);
   	 assertEquals("firstPerson a","a",a.getFirstName());

  	
   	 Truck NewTruck= new Truck();
   	 NewTruck.setOwner(a);
   	 NewTruck.setNumberOfAxels(2);
   	 assertEquals("truck person a", "a",NewTruck.getOwner().getFirstName());
   	 Person b= new Person();
   	 b.setFirstName("b");
   	 NewTruck.setOwner(b);
   	 assertEquals(" truck person b", "b",NewTruck.getOwner().getFirstName());


   	 
   	 
   	 Motorcycle NewMotorcycle= new Motorcycle();
   	 NewMotorcycle.setHasSideCar(false);
   
   	 
  	assertEquals(" Person a car has 4 doors", 4, NewCar.getNumberOfDoors());
  	assertEquals("truck by Person a has 2 axels",2, NewTruck.getNumberOfAxels());
 	assertEquals("Motorcycle without a sidecar", false, NewMotorcycle.isHasSideCar());

	}

}