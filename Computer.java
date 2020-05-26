package ssdMediatorDesignPattern;

//concrete colleage 2.1
public class Computer implements Device {
    private Mediator mediator;
    private boolean status;
    private String name;
    public Computer (Mediator m, String name){
        this.mediator = m;
        this.status = true;
        this.name = name;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public boolean getStatus() {
        return this.status;
    }

    @Override
    public void setStatus() {
        if(getStatus()) {
            off();
            status = false;
        } else {
            on();
            status = true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.format("%s receives message: %s \n",getName(), msg);
    }
    @Override
    public void on() {
        System.out.format("%s switched on",getName());
    }
    @Override
    public void off() {
        System.out.format("%s switched off",getName());
    }

}
