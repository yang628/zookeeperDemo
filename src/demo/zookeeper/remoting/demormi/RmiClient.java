package demo.zookeeper.remoting.demormi;
 
import demo.zookeeper.remoting.common.HelloService;
import java.rmi.Naming;
 
public class RmiClient {
 
    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost:1099/demo.zookeeper.remoting.demormi.HelloServiceImpl";
        HelloService helloService = (HelloService) Naming.lookup(url);
        String result = helloService.sayHello("Y");
        System.out.println(result);
    }
}