public class DistanceConverter {
    public int kms_to_meters(int kms){ return kms * 1000; }
    public int kms_to_cms(int kms) { return kms * 100000; }
    public int kms_to_mm(int kms) { return kms*1000000; }
    public double kms_to_miles(int kms) { return kms*0.621; }
    public double kms_to_foot(int kms) { return kms*3280.840; }
    public double kms_to_inch(int kms) { return kms*39370.1; }
}
