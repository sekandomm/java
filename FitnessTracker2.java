package chapter4;
import java.time.*;
public class FitnessTracker2 {
   String activity;
   int minutes;
   LocalDate date;
   public FitnessTracker2() {this("running", 0, LocalDate.of(2019, 1, 1));}
   public FitnessTracker2(String a, int m, LocalDate d) {
      activity = a;
      minutes = m;
      date = d;
   }
   public String getActivity() {return activity;}
   public int getMinutes() {return minutes;}
   public LocalDate getDate() {return date;}
}