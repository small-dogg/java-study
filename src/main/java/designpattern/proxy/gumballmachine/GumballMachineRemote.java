package designpattern.proxy.gumballmachine;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**원격 인터페이스(다른 JVM에 있는 객체를 대신 호출할 수 있도록 대리인의 역할을 수행)
 * RMI(Remote Method Invocation) 프로토콜을 통해, 메시지를 전달함.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
