package ssdMediatorDesignPattern;

//concrete colleage 2.1
public class Computer implements Device {
    private ConcreteMediator mediator;
    private boolean status;
    private String name;
    public Computer (ConcreteMediator m, String name){
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
        System.out.format("%s receives message: %s ",getName(), msg);
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