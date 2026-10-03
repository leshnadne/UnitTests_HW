import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ru.netology.Grader;

public class GraderTest {
    
    @Test 
    public void shouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
}
