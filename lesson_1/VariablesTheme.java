public class VariablesTheme {
    public static void main(String[] args) {
        byte numberOfCores = 4;
        short processorFrequency = 3200;
        int ramSizeInGB = 8;
        long hddCapacityInGB = 1000;
        float processorTemperature = 45.5f;
        double cpuUsagePercentage = 72.56;
        char processorCodeName = 'C';
        boolean isComputerOn = true;

        System.out.println("1.Вывод характеристик компьютера\n"+"Number of Cores: " + numberOfCores 
         + "\nProcessor Frequency: " + processorFrequency + " MHz\n" + "RAM Size: " + ramSizeInGB + 
        " GB\n" + "HDD Capacity: " + hddCapacityInGB + " GB\n" + "Processor Temperature: " + 
        processorTemperature + " °C\n" + "CPU Usage Percentage: " + cpuUsagePercentage + "%\n" + 
        "Processor Code Name: " + processorCodeName + "\nIs Computer On: " + isComputerOn);

        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;

        System.out.println("\n2.Расчет стоимости товара со скидкой\n" + 
        "Общая стоимость товара без скидки " + (penPrice+bookPrice) + "\nСумма скидки " + 
        ((penPrice+bookPrice)*11/100) + "\nОбщая стоимость товаров со скидкой " + 
        ((penPrice+bookPrice)-(penPrice+bookPrice)*11/100)) ;
    }
}