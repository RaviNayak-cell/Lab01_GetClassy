import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Product("candy", "sour", "000001", 1.00);
        p2 = new Product("chips", "salty", "000002", 3.25);
        p3 = new Product("drinks", "thirsty", "000003", 2.50);
        p4 = new Product("fruit", "sweet", "000004", 4.75);
        p5 = new Product("Veggies", "fresh", "000005", 5.00);
        p6 = new Product("Chicken", "juicy", "000006", 7.99);
    }

    @Test
    void setName() {
        p1.setName("candy");
        assertEquals("candy", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("sour");
        assertEquals("sour", p1.getDescription());
    }

    @Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001", p1.getID());
    }

    @Test
    void setCost() {
        p1.setCost(1.00);
        assertEquals(1.00, p1.getCost());
    }
}