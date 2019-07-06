import com.vlada.tasks.finalgrade.FinalGrade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FinalGradeTest {

    @Test
    public void finalGrades() {
        int grade = 60;
        int projects =6;

        int finalGrade = FinalGrade.finalGrade(grade,projects);

        assertEquals(75,finalGrade);
        grade = 10;
        projects = 0;
        finalGrade = FinalGrade.finalGrade(grade,projects);
        assertEquals(0,finalGrade);


        grade = 40;
        projects = 11;
        finalGrade = FinalGrade.finalGrade(grade,projects);
        assertEquals(100,finalGrade);

        grade = 90;
        projects = 6;
        finalGrade = FinalGrade.finalGrade(grade,projects);
        assertEquals(90,finalGrade);
    }
}