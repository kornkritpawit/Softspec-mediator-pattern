package ssdMediatorDesignPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConcreteMediator mediator = new ConcreteMediator();
        System.out.print("mediator created");
        input.nextLine();

        System.out.print("Create mobile phone.");
        input.nextLine();
        Mobile phone = new Mobile(mediator, "iphone");
        System.out.format("%s is created",phone.getName());
        input.nextLine();
        System.out.print("Create Tablet.");
        input.nextLine();
        Tablet tablet = new Tablet(mediator, "IPad pro");
        System.out.format("%s is created", tablet.getName());
        input.nextLine();
        System.out.print("Create other tablet");
        input.nextLine();
        Tablet tablet2 = new Tablet(mediator, "Galaxy tab");
        System.out.format("%s is created", tablet2.getName());
        input.nextLine();
        System.out.print("Create computer.");
        Computer pc = new Computer(mediator,"Asus labtop");
        System.out.format("%s is created",pc.getName());
        input.nextLine();
        System.out.print("Create other mobile.");
        Mobile phone2 = new Mobile(mediator, "Samsung");
        System.out.format("%s is created \n",phone2.getName());

        TurnOn switchOn = new TurnOn(mediator);
        TurnOff switchOff = new TurnOff(mediator);
        System.out.print("switchOn and switchOff are created");
        input.nextLine();
        mediator.registerDevice(phone);
        mediator.registerDevice(tablet);
        mediator.registerDevice(phone2);
        mediator.registerDevice(pc);
        mediator.registerDevice(tablet2);
        System.out.println("Registered all device total = 5");
        while (true){
            System.out.format("Devices: 1)%s, 2)%s, 3)%s, 4)%s, 5)%s\n",
                    phone.getName(),tablet.getName(),tablet2.getName(),pc.getName(),phone2.getName());
            System.out.format("Devices status: 1)%b, 2)%b, 3)%b, 4)%b, 5)%b\n",
                    phone.getStatus(),tablet.getStatus(),tablet2.getStatus(),pc.getStatus(),phone2.getStatus());

            System.out.print("choose method 1(send message) 2(TurnOn) 3(TurnOff) else(exit): ");
            char choice = input.next().charAt(0);

            if(choice==('1')){
                System.out.println("Which device you want to send message?");
                System.out.print("1(iphone) 2(Ipad pro) 3(Galaxy tab) 4(Azus labtop) 5(Samsung): ");
                char device = input.next().charAt(0);
                System.out.println("message: ");
                String message = input.nextLine();
                message = input.nextLine();

                if(device==('1')){
                    phone.send(message);
                }
                else if(device==('2')){
                    tablet.send(message);
                }
                else if (device==('3')){
                    tablet2.send(message);
                }
                else if (device==('4')){
                    pc.send(message);
                }
                else if(device==('5')){
                    phone2.send(message);
                }
            }
            else if(choice==('2')){
                System.out.println("Which device you want to TurnOn?");
                char device = input.next().charAt(0);
                if(device==('1')){
                    switchOn.execute(phone);
                }
                else if(device==('2')){
                    switchOn.execute(tablet);
                }
                else if (device==('3')){
                    switchOn.execute(tablet2);
                }
                else if (device==('4')){
                    switchOn.execute(pc);
                }
                else if(device==('5')){
                    switchOn.execute(phone2);
                }            }
            else if(choice==('3')){
                System.out.println("Which device you want to TurnOff?");
                char device = input.next().charAt(0);
                if(device==('1')){
                    switchOff.execute(phone);
                }
                else if(device==('2')){
                    switchOff.execute(tablet);
                }
                else if (device==('3')){
                    switchOff.execute(tablet2);
                }
                else if (device==('4')){
                    switchOff.execute(pc);
                }
                else if(device==('5')){
                    switchOff.execute(phone2);
                }                 }
            else break;

        }
        System.out.println("Bye");
//        tablet2.send("Bello");
//        pc.send("Hello world!");
//        switchOff.execute(pc);
//        switchOff.execute(pc);
//        switchOn.execute(pc);
//
//        switchOff.execute(phone);
//        tablet.send("I am tablet");
//        phone.send("Hi I am iphone");
//        switchOff.execute(tablet);
//        switchOn.execute(phone);


    }
}
