package wk3;

public class Person {

    //attributes

    //instance variable
    //dataType name;

    String name;  //default aka package-private
    public double height;
    protected float weight;
    private String dob;  //only accessible inside of class


    //method

    //accessLevel returnDataType name([parameter list]){}

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        //enforce the restrictions so that user
        // must input of in the form of
        // Three-Lettered-Month, Two-Digit-Day, Four-Digit-Year
        // if not, print error. if yes, set this.dob to dob

        String[] components = dob.split(",");
        String[] monthAndDay = components[0].split(" ");
        if(components[1].length() == 4 && monthAndDay[0].length() == 3
        && monthAndDay[1].length() == 2 ){
            this.dob = dob;

        }
        else{
            System.out.println("Invalid date format. Please use MMM DD,YYYY");
        }


//        //then year is not 4-digits
//        if(components[1].length() != 4){}
//        //month is not 3 letters
//        if(monthAndDay[0].length() != 3){}
//        //day of the month is not two-digit
//        if(monthAndDay[1].length() != 2){}

        //.split(string value)  comma  => array of values


    }

}
