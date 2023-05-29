import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenstrualCycleCalculator {
    public static void main(String[] args) {
    calculatingMenstrualCycle("2023-04-23",25,5);
    }


    public static void calculatingMenstrualCycle(String dateOfLastMenses, int menstrualCycleDays, int noOfDaysOfFlow){
        LocalDate StartOfLastMenses = LocalDate.parse(dateOfLastMenses);
        int ovulationStart = (menstrualCycleDays /2)-1;
        int firstFreePeriod = (noOfDaysOfFlow-1);
        int nextFreePeriod = (ovulationStart+3);


        for(int x = 0;x<12;x++){
            List<String> freePeriods = new ArrayList<>();
            List<LocalDate> ovulationDays = new ArrayList<>();
            LocalDate nextMenses = StartOfLastMenses.plusDays(menstrualCycleDays);
            for (int y = firstFreePeriod; y < ovulationStart; y++){
                LocalDate freeDay = StartOfLastMenses.plusDays(y);
                String freeDays= freeDay.toString();
                freePeriods.add(freeDays);
            }
            for(int r = ovulationStart; r<=(ovulationStart+2);r++){
                LocalDate ovulationPeriod = StartOfLastMenses.plusDays(r);
                ovulationDays.add(ovulationPeriod);
            }
            for(int s = nextFreePeriod; s < menstrualCycleDays; s++ ){
                LocalDate freeDay = StartOfLastMenses.plusDays(s);
                String freeDays= freeDay.toString();
                freePeriods.add(freeDays);
            }
            System.out.println("your last menstrual cycle started "+ StartOfLastMenses);
            System.out.println("your next menstrual cycle start on "+ nextMenses);
            System.out.println( "the following days are your free periods :"+ freePeriods);
            System.out.println("your ovulation days are :"+ovulationDays);
            System.out.println();
            System.out.println();
            StartOfLastMenses= nextMenses;
        }

    }
}
