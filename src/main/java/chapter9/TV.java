package chapter9;

/**
 * Created by rajanishivarajmaski1 on 3/29/17.
 */
public class TV {

    int channel;
    int volumeLevel;
    boolean tvSwitch;

    // no arg constructor
    public TV(){
        this.channel = 1;
        this.volumeLevel = 5;
        this.tvSwitch = true;

    }

    // 3 arg constructor
    public TV(int channel1, int volume, boolean newSwitch){
        this.channel = channel1;
        this.volumeLevel = volume;
        this.tvSwitch = newSwitch;

    }

    public void turnOn() {
        this.tvSwitch = true;
    }

    public void turnOff() {
        this.tvSwitch = false;
    }

    public void  setChannel(int newChannel){
        this.channel = newChannel;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        this.volumeLevel = this.volumeLevel+1;
    }

    public void volumeDown(){
        this.volumeLevel = this.volumeLevel-1;
    }

}
