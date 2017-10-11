import com.mycompany.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkUsername(){
        final String username = "Ariel18";
        Student s1 = new Student("Ariel", 18, "20/07/1999");
        assertEquals(s1.getUsername(), username);
    }
}
    
