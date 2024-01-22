import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "ravi", "Tester1", "", 2003);
        p2 = new Person("000002", "tom", "Tester2", "Mr.", 2000);
        p3 = new Person("000003", "Sri", "Tester3", "Mr.", 1995);
        p4 = new Person("000004", "john", "Tester4", "", 2008);
        p5 = new Person("000005", "lebron", "Tester5", "Mr.", 1985);
        p6 = new Person("000006", "steph", "Tester6", "Mr.", 1989);
    }


    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("ravi");
        assertEquals("ravi", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Tester1");
        assertEquals("Tester1", p1.getLastName());
    }

    @Test
    void setTitle() {
        p2.setTitle("Mr.");
        assertEquals("Mr.", p2.getTitle());
    }

    @Test
    void setYOB() {
        p3.setYOB(1995);
        assertEquals(1995, p3.getYOB());
    }
}