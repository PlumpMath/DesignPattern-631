
public class MeWithACat extends Me{
  
    @Override
    public Pet getMyPet() {
        return new Cat();
    }
  
}
