package ssdMediatorDesignPattern;

//concrete colleague 1.2
public class TurnOff implements Command {
    private Mediator med;

    public TurnOff(Mediator med) {this.med = med;}

    @Override
    public void execute(Device obj) {
        med.turnOffDevice(obj);
    }
}
