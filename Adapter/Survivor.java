public class Survivor {

    public void Survivor() {}

    public void kill(Zombie zombie) {
        zombie.defense();
        System.out.println("Killing zombie");
    }

}