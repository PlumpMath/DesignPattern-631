
public class SerialCircuit extends Circuit {
 
    private static final String CIRCUIT_NAME = "Serial Circuit";
 
    @Override
    public double getResistance() {
        double temp = 0;
        for (Equipment e : equipments) {
            temp += e.getResistance();
        }
        return temp;
    }
 
    @Override
    public String getName() {
        return CIRCUIT_NAME;
    }
}