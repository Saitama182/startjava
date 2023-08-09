public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setOrigin("Pan Pacific Defense Corps");
        jaegerOne.setHeight(81.8f);
        jaegerOne.setWeight(2.004f);

        System.out.println(jaegerOne);
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.useWeapon();
        jaegerOne.move();
        jaegerOne.drift();
    }
}