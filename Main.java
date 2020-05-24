package ssdMediatorDesignPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Mobile phone = new Mobile(mediator, "iphone");
        Tablet tablet = new Tablet(mediator, "IPad pro");
        Computer pc = new Computer(mediator,"myCom1");

        TurnOn switchOn = new TurnOn(mediator);
        TurnOff switchOff = new TurnOff(mediator);
        mediator.registerDevice(phone);
        mediator.registerDevice(tablet);
        mediator.registerDevice(pc);

        pc.send("Hello world!");
        switchOff.execute(pc);
        switchOff.execute(pc);
        switchOn.execute(pc);

        switchOff.execute(phone);
        tablet.send("I am tablet");
        phone.send("Hi I am iphone");
        switchOff.execute(tablet);
        switchOn.execute(phone);


    }
}
