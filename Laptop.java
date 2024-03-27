package Package.com.latihan;

public interface Laptop {
    int Max_VOL= 100;
    int MIN_VOL= 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    void turnOnLaptop(){
        this.laptop.powerOn();
    }

    void turnOffLaptop(){
        this.laptop.powerOff();
    }

    void makeLaptopLounder(){
        this.laptop.volumeUp();
    }

    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}

class Lenovo implements Laptop{

    private int Volume;
    boolean is_power_on;

    public Lenovo() {
        this.Volume= 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Laptop ThikPad");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process ...");
    }

    @Override
    public void volumeUp() {
        if(is_power_on){
            if(this.Volume == Max_VOL){
                System.out.println("Volume is Full");
            } 
            else {
                this.Volume += 10;
                System.out.println("Volume ditingkatkan menjadi : " + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if(is_power_on) {
            if(this.Volume == MIN_VOL){
                System.out.println("Volume is 0% ");
            }
            else {
                this.Volume -= 10;
                System.out.println("Volume dikurangi menjadi : "  + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.Volume;
    }
    
}

class Toshiba implements Laptop {
    private int Volume;
    boolean is_power_on;

    public Toshiba(){
        this.Volume = 60;
    }

    @Override
    public void powerOn() {
        is_power_on=true;
        System.out.println("Laptop is On");
        System.out.println("Toshiba ");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process");
    }

    @Override
    public void volumeUp() {
        if(is_power_on){
            if(this.Volume == Max_VOL){
                System.out.println("Volume is Full");
            }
            else {
                this.Volume +=10;
                System.out.println("Volume us :" + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if(is_power_on){
            if(Volume == MIN_VOL){
                System.out.println("Volume is 0% ");
            }
            else {
                this.Volume -=10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.Volume;
    }
}


class MacBook implements Laptop {
    private int Volume;
    boolean is_power_on;

    public MacBook(){
        this.Volume = 40;
    }

    @Override
    public void powerOn() {
        is_power_on=true;
        System.out.println("Laptop is On");
        System.out.println("MacBook ");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutdown is process");
    }

    @Override
    public void volumeUp() {
        if(is_power_on){
            if(this.Volume == Max_VOL){
                System.out.println("Volume is Full");
            }
            else {
                this.Volume +=10;
                System.out.println("Volume us :" + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown() {
        if(is_power_on){
            if(Volume == MIN_VOL){
                System.out.println("Volume is 0% ");
            }
            else {
                this.Volume -=10;
                System.out.println("Volume is : " + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.Volume;
    }
}