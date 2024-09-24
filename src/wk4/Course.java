package wk4;

public class Course {

    private String courseName = "Course";
    private String courseCode = "comp1234";
    enum Semesters {FALL, WINTER, SUMMER}
    public Semesters courseSemester = Semesters.FALL;

   // public final int passingGrade = 50;
   public final int passingGrade;

    public Course(){
        passingGrade = 50;
    }
    //constructor = method => no return data type. name EXACT name of class
    public Course(String courseName, String courseCode, Semesters courseSemester){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseSemester = courseSemester;
        passingGrade = 50;
    }
    public Course(String courseName, Semesters courseSemester, String courseCode){
        this(courseName, courseCode, courseSemester);
    }
    public Course(String courseName){
        this.courseName = courseName;
        passingGrade = 50;
    }
    public Course(String courseName, int passingGrade){
        this(courseName);
        passingGrade = passingGrade;
    }
    void myMethod(){}
    //just the courseCode   will it be valid? NO. why not?

    //factory method?

    static Course graduateCourse(){

        return new Course("Graduate Course", "grad1234", Semesters.WINTER);
    }

}
