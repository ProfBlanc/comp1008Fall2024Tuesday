package wk5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class CarTest {


    @Test
    public void testDefaultConstructor(){
        Car car = new Car();
        assertEquals("Toyota",car.getMake());
        assertTrue(car.getModel().equals("Corolla"));
        assertNotNull(car);
        assertNotEquals(2020,car.getYear());
    }

    @Test
    public void test4ArgConstructor(){
        Car car = new Car("Make", "Model", 2001, Car.EngineType.V6);

        assertEquals("Make",car.getMake());
        assertEquals("Model",car.getModel());
        assertNotNull(car.getEngineType());
    }

    @Test
    public void testSetYearWithValidValues(){
        Car car = new Car();

        car.setYear(2001);
        assertEquals(2001, car.getYear());
    }

    @Test
    public void testSetYearWithInvalidValues(){

        Car car = new Car();
        try {
            car.setYear(1999);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        assertNotEquals(1999, car.getYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2002, 2020, 2040, 3000})  //any primitive data type, add s at end
                                                            //strings
    public void testSetYearWithValidValues(int year){

        Car car = new Car();
        car.setYear(year);
        assertEquals(year, car.getYear());
    }

    @ParameterizedTest
    @CsvSource({"Make,Model,2005,V10","Honda,Accord,2010,V6","Nissan,Rogue,2007,V4"})
    public void test4ArgConstructorWithValidValues(String make, String model,
                                                   int year, String engineType
                                                   ){

            Car car = new Car(make, model, year, engineType);
            assertEquals(make, car.getMake());
            assertEquals(model, car.getModel());
            assertEquals(year, car.getYear());
            assertEquals(engineType, car.getEngineType().toString());
    }
}