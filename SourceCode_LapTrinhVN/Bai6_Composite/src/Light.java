public class Light implements Equipment {
 
    private static final int LIGHT_RESISTANCE = 10;
    private static final String LIGHT_NAME = "The light";
 
    @Override
    public double getResistance() {
        return LIGHT_RESISTANCE;
    }
 
    @Override
    public String getName() {
        return LIGHT_NAME;
    }
 
}