public class MeWithADog extends Me {
  
    @Override
    public Pet getMyPet() {
        return new Dog();
    }
  
}
