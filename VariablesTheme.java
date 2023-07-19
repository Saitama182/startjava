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
        
        System.out.println("\n3.Вывод слова JAVA\n" + "   J    a  v     v  a   \n" + 
        "   J   a a  v   v  a a  \n" + "J  J  aaaaa  V V  aaaaa \n" + 
        " JJ  a     a  V  a     a");

        byte varByte = Byte.MAX_VALUE;;
        short varShort = Short.MAX_VALUE;
        int varInt = Integer.MAX_VALUE;
        long varLong = Long.MAX_VALUE;
        byte varByteInc = varByte++;
        short varShortInc = varShort++;
        int varIntInc = varInt++;
        long varLongInc = varLong++;
        byte varByteDec = varByte--;
        short varShortDec = varShort--;
        int varIntDec = varInt--;
        long varLongDec = varLong--;

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n" + 
        "Первоначальное значение byte " + varByte + "\nЗначение byte после инкремента на единицу " + 
        varByteInc + "\nЗначение byte после декремента на единицу " + varByteDec + 
        "\nПервоначальное значение short " + varShort + "\nЗначение short после инкремента на единицу " + 
        varShortInc + "\nЗначение short после декремента на единицу " + varShortDec + 
        "\nПервоначальное значение int " + varInt + "\nЗначение int после инкремента на единицу " + 
        varIntInc + "\nЗначение int после декремента на единицу " + varIntDec + 
        "\nПервоначальное значение long " + varLong + "\nЗначение long после инкремента на единицу " + 
        varLongInc + "\nЗначение long после декремента на единицу " + varLongDec);
    }
}