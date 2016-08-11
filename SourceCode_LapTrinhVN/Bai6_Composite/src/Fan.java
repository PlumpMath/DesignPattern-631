public class Fan implements Equipment {
 
    private static final int FAN_RESISTANCE = 20;
    private static final String FAN_NAME = "The fan";
 
 
    @Override
    public double getResistance() {
        return FAN_RESISTANCE;
    }
 
    @Override
    public String getName() {
        return FAN_NAME;
    }
 
}
