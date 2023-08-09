public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMaleGender(true);
        wolf.setNickname ("Spike");
        wolf.setWeight(35.4);
        wolf.setAge (5);
        wolf.setColor("white");

        System.out.println(wolf.getMaleGender() + ", " + wolf.getNickname() + ", " + wolf.getWeight() +
                ", " + wolf.getAge() + ", " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}