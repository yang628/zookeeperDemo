package demo.zookeeper.remoting.server;
 
import demo.zookeeper.remoting.common.HelloService;
import demo.zookeeper.remoting.demormi.HelloServiceImpl;

/**
 * 服务器端： 可以分布在不同机器上
 */
public class Server {
 
    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.err.println("please using command: java Server <rmi_host> <rmi_port>");
//            System.exit(-1);
//        }
// 
//        String host = args[0];
//        int port = Integer.parseInt(args[1]);
// 
    	
//    	当前rmi服务器的ip 和端口 本机， 服务端要提供的服务
        String host = "10.211.55.2";
        int port = Integer.parseInt("11232");
        HelloService helloService = new HelloServiceImpl();

        //写服务提供者：包括注册到zookeeper
        ServiceProvider provider = new ServiceProvider();

        //把端口，服务端的地址  放入zookeeper中
        provider.publish(helloService, host, port);
 
        Thread.sleep(Long.MAX_VALUE);
    }
}