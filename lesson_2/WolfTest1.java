public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.maleGender = true;
        wolf.nickname = "Spike";
        wolf.weight = 35.4;
        wolf.age = 5;
        wolf.color = "white";

        System.out.println(wolf.maleGender + ", " + wolf.nickname + ", " + wolf.weight +
                ", " + wolf.age + ", " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}