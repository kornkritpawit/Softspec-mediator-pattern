package ssdMediatorDesignPattern;
import java.util.ArrayList;
import java.util.List;

//concrete mediator
public class ConcreteMediator implements Mediator {
    private List<Device> devices = new ArrayList<>();

    public void registerDevice(Device device) { devices.add(device);}

    @Override
    public void send(String msg, Device sender) {
        if (sender.getStatus()) {
            System.out.format("%s send messages: %s",sender.getName(),msg);
            System.out.println();
            for (Device receiver : devices) {
                if (receiver.getStatus()) {
                    if (receiver != sender) {
                        receiver.receiveMsg(msg);
                    }
                } else {
                    System.out.format("Send to %s is unsuccessful \n", receiver.getName());
                }
            }
        } else{
            System.out.format("Can't send!! %s is turn off",sender.getName());
        }
        System.out.println();

    }

    @Override
    public void turnOnDevice(Device obj) {
        if(obj.getStatus()!=true) {
            obj.setStatus();
        } else {
            System.out.format("%s is already turn on!!! ", obj.getName());
        }
        System.out.println();

    }

    @Override
    public void turnOffDevice(Device obj) {
        if(obj.getStatus()){
            obj.setStatus();
        } else {
            System.out.format("%s is already turn off!!!", obj.getName());
        }
        System.out.println();

    }
}
