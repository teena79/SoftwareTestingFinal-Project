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
}