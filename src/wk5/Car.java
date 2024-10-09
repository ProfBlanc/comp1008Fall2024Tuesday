package wk5;

/**
 * This is a wonderful class that I am very proud of.
 * Who am I, you ask?
 * @author Ben Blanc
 * @since 2024-10-08
 * @version 1.0
 */
public class Car {
    /** This is the make of the car */
    private String make = "Toyota";

    /** This is the model of the car */
    private String model = "Corolla";

    /** the year the Car was released */
    private int year = 2000;

    public enum EngineType {V3, V4, V6, V8, V10, V12}
    private EngineType engineType = EngineType.V4;

    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the car. The make must be at least 5 characters
     * @param make attempted value to set the instance variable of make
     */
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 2000)
            throw new IllegalArgumentException("Invalid year");
        this.year = year;
    }

    public Car(String make, String model, int year, EngineType engineType) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.engineType = engineType;
        setMake(make);
        setModel(model);
        setYear(year);
        setEngineType(engineType);
    }
    public Car(String make, String model, int year, String engineType) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.engineType = engineType;
        setMake(make);
        setModel(model);
        setYear(year);
        setEngineType(engineType);
    }

    public EngineType getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        try {
            this.engineType = EngineType.valueOf(engineType);
        }
        catch (Exception e){
            System.err.println(engineType + " is not a valid Engine Type");
            this.engineType = EngineType.V4;
        }
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineType=" + engineType +
                '}';
    }
}
