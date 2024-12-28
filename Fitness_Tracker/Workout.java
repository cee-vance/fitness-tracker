import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *  Represents a workout with properties
 *  type: Cardio, Strength training upper and lower
 *  minutes: the duration of the workout
 *  date: The date of the workout
 *  
 * @author cee-vance
 * @version 1.0.0
 */
public class Workout implements Comparable<Workout>
{
   private int mins;
   private Date workoutDate;
   private  WorkoutType workoutType;
   
   private SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
   
   /**
    * Workout Constructor
    *
    * @param workoutType discrete workout types
    * @param mins the minutes as integer
    * @param workoutDate Sets the date that the workout happened
    */
   public Workout( WorkoutType workoutType,int mins, Date workoutDate) {
       this.setWorkoutType(workoutType);
       this.setMins(mins);
       this.setWorkoutDate(workoutDate);
   }
   
   /**
    * Workout Constructor
    * 
    * @param workoutType discrete workout types
    * @param mins the minutes as integer
    */
   public Workout(WorkoutType workoutType,int mins){    
       this(workoutType,mins,new Date());
   }
   
   /*
    * Getters and setters
    */
   public WorkoutType getWorkoutType() {
       return this.workoutType;
   }
   
   public int getMins() {
       return this.mins;
   }
   
   public Date getWorkoutDate() {
       return this.workoutDate;
   }
   
   public void setWorkoutType(WorkoutType workoutType) {
       this.workoutType = workoutType;
   }
   
   public void setMins(int mins) {
       if(mins <= 0) {
           throw new IllegalArgumentException("Workout minutes must be greater than zero.");
       }
       this.mins = mins;
   }
   
   public void setWorkoutDate(Date workoutDate) {
       this.workoutDate = workoutDate;
   }
   
   /**
    * Method compareTo
    *
    * sorts Workouts by descending date
    * 
    * @param other Workout to compare
    * @return The return int positive if Workout later, negative otherwise
    */
   @Override
   public int compareTo(Workout other) {
       return this.getWorkoutDate().compareTo(other.getWorkoutDate());
   }
   
   @Override
   public String toString() {
       return String.format("Type: %s Date: %s Duration (Mins): %d",
       this.getWorkoutType(),
       this.formatter.format(this.getWorkoutDate()),
       this.getMins());
   }
   
}
