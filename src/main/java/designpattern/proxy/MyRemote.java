package designpattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 가상 프록시(Virtual Proxy)
 * 실제 객체의 생성 비용이 비싸, 진짜로 실제 객체가 필요할 때 호출할 수 있도록
 * 대리인이 대기하고잇다가 요청할때 호출.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
