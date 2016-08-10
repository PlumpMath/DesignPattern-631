import java.util.LinkedList;
import java.util.List;
 
public abstract class Circuit implements Equipment {
 
    protected List<Equipment> equipments = new LinkedList<Equipment>();
 
    public void addEquipment(Equipment equipment) {
        if (equipment != null) {
            equipments.add(equipment);
        }
    }
}