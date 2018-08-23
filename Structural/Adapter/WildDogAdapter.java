public class WildDogAdapter implements Zombie {
    
    protected WildDog wildDog;

    public WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    public void defense() {
        this.wildDog.bark();
    }
}