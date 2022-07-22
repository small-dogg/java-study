package designpattern.proxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("Gumballmachine <name> <inventory>");
        }

        try{
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
