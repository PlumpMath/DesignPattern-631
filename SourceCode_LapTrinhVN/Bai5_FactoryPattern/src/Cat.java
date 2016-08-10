
public class Cat extends Pet {

	@Override
    public Pet giveBirth() {
        return new Cat();
    }
  
    @Override
    public void talk() {
        System.out.println("Mew Mew");
    }
}
