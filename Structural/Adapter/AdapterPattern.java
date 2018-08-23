public class AdapterPattern {

    public static void main(String args[]) {

        RunnerZombie runner = new RunnerZombie();
        WildDog dog = new WildDog();
        WildDogAdapter wildDog = new WildDogAdapter(dog);
        Survivor survivor = new Survivor();
        survivor.kill(runner);
        survivor.kill(wildDog);

    }

}