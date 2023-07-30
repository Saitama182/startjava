public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 32; 
        int attempt = 1; 
        
        while (true) {
            if (attempt == hiddenNumber) {
                System.out.println("Вы победили!");
                break;
            } else if (attempt > hiddenNumber) {
                System.out.println("Число " + attempt + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + attempt + " меньше того, что загадал компьютер");
            }
            
            attempt++; 
        }
    }
}