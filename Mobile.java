package ssdMediatorDesignPattern;

//concrete colleague 2.3
public class Mobile implements Device {
    private ConcreteMediator mediator;
    private boolean status;
    private String name;
    public Mobile (ConcreteMediator m, String name){
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
        System.out.format("%s receives message: %s ", getName(), msg);
    }
    @Override
    public void on() {
        System.out.format("%s switched on",getName());
    }
    @Override
    public void off() {
        System.out.format("%s Mobile switched off",getName());
    }

}
