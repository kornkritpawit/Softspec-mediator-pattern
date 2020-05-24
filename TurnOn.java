package ssdMediatorDesignPattern;

//concrete colleague 1.1
public class TurnOn implements Command {
    private ConcreteMediator med;

    public TurnOn(ConcreteMediator med) {this.med = med;}

    @Override
    public void execute(Device obj) {
        med.turnOnDevice(obj);
    }
}
