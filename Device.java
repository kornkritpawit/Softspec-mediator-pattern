package ssdMediatorDesignPattern;

//colleague2
public interface Device {
    public void  send(String msg);
    public String getName();
    public boolean getStatus();
    public void setStatus();
    public void receiveMsg(String msg);
    public void on();
    public void off();
}
