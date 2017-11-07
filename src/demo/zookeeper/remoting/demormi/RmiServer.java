package demo.zookeeper.remoting.demormi;
 
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
 
public class RmiServer {
 
    public static void main(String[] args) throws Exception {
        //指定一个端口号
        int port = 1099;
        //rmi 是java原生的通信方式
        String url = "rmi://localhost:1099/demo.zookeeper.remoting.demormi.HelloServiceImpl";
        LocateRegistry.createRegistry(port);
        Naming.rebind(url, new HelloServiceImpl());
    }
}