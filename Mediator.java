package ssdMediatorDesignPattern;
//mediator
public interface Mediator {
    public void send(String msg, Device sender);
    public void turnOnDevice(Device obj);
    public void turnOffDevice(Device obj);


}


