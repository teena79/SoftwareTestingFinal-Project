import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceConverterTest {
    @Test
    public void kms_to_metres_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(10000,a.kms_to_meters(10));
    }
    @Test
    public void kms_to_cms_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(1000000,a.kms_to_cms(10));
    }
    @Test
    public void kms_to_mm_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(10000000,a.kms_to_mm(10));
    }
    @Test
    public void kms_to_meters_test_2(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(50000,a.kms_to_meters(50));
    }
    @Test
    public void kms_to_miles_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(6.21,a.kms_to_miles(10),0.0f);
    }
    @Test
    public void kms_to_foot_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(32808.4,a.kms_to_foot(10),0.0f);
    }
    @Test
    public void kms_to_inch_test(){
        DistanceConverter a = new DistanceConverter();
        assertEquals(393701,a.kms_to_inches(10),0.0f);
    }
}
