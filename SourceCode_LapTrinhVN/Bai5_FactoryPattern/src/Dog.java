
public class Dog extends Pet {

	@Override
    public Pet giveBirth() {
        return new Dog();
    }
  
    @Override
    public void talk() {
        System.out.println("Wolf Wolf");
    }
}
