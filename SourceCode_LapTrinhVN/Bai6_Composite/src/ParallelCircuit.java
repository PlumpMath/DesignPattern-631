public class ParallelCircuit extends Circuit {
 
    private static final String CIRCUIT_NAME = "Parallel Circuit";
 
    @Override
    public double getResistance() {
        double temp = 0;
        for (Equipment e : equipments) {
            temp += 1.0 / e.getResistance();
        }
        return 1.0 / temp;
    }
 
    @Override
    public String getName() {
        return CIRCUIT_NAME;
    }
}