package demo.zookeeper.remoting.demormi;
 
import demo.zookeeper.remoting.common.HelloService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
 
    public HelloServiceImpl() throws RemoteException {
    }
 
    @Override
    public String sayHello(String name) throws RemoteException {
        //字符创匹配
        return String.format("Hello %s", name);
    }
}