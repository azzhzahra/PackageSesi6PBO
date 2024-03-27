package Package.com.latihan;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Lenovo
        // Laptop thkinkpad = new Lenovo();
        // LaptopUser bahri = new LaptopUser(thkinkpad);

        // bahri.turnOnLaptop();
        // bahri.turnOffLaptop();
        // bahri.makeLaptopLounder();
        // bahri.makeLaptopSilence();

        // // Toshiba
        // Laptop Toshiba = new Toshiba();
        // LaptopUser abi = new LaptopUser(Toshiba);
        
        // Scanner scanner = new Scanner(System.in);
        // boolean isRunning = true;

        // while (isRunning) {

        //     System.out.println("Masukkan Printah ON/OFF/UP/DOWN: ");
        //     String command = scanner.next();

            
        //     switch (command.toUpperCase()) {
        //         case "ON":
        //             abi.turnOnLaptop();
        //             break;
        //         case "OFF":
        //             abi.turnOffLaptop();
        //             break;
        //         case "UP":
        //             abi.makeLaptopLounder();
        //             break;
        //         case "DOWN":
        //             abi.makeLaptopSilence();
        //             break;

        //             default:
        //             System.out.println("Tidak valid");
        //         }
        // }
        // scanner.close();


        // Macbook
        Laptop MacBook = new MacBook();
        LaptopUser kodir = new LaptopUser(MacBook);
        
        Scanner scanner2 = new Scanner(System.in);
        boolean isRunning2 = true;

        while (isRunning2) {

            System.out.println("Masukkan Printah ON/OFF/UP/DOWN: ");
            String command = scanner2.next();

            
            switch (command.toUpperCase()) {
                case "ON":
                    kodir.turnOnLaptop();
                    break;
                case "OFF":
                    kodir.turnOffLaptop();
                    break;
                case "UP":
                    kodir.makeLaptopLounder();
                    break;
                case "DOWN":
                    kodir.makeLaptopSilence();
                    break;

                    default:
                    System.out.println("Tidak valid");
                }
        }
        scanner2.close();
    }
    
}
