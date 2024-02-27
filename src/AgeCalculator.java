import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    AgeCalculator(String dob){
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate todayDate = LocalDate.now();
        Period period = Period.between(birthDate, todayDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.printf("Your age is: %d years, %d months, and %d days.\n", years, months, days);
    }
}
