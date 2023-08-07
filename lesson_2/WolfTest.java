public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        
        wolf.nickname = "Jack";
        wolf.weight = 40;
        wolf.age = 7;
        wolf.color = "white";
        System.out.println( wolf.nickname + wolf.weight + wolf.age + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}