package demo.zookeeper.remoting.server;
 
import demo.zookeeper.remoting.common.HelloService;
import demo.zookeeper.remoting.demormi.HelloServiceImpl;

/**
 * �������ˣ� ���Էֲ��ڲ�ͬ������
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
    	
//    	��ǰrmi��������ip �Ͷ˿� ������ �����Ҫ�ṩ�ķ���
        String host = "10.211.55.2";
        int port = Integer.parseInt("11232");
        HelloService helloService = new HelloServiceImpl();

        //д�����ṩ�ߣ�����ע�ᵽzookeeper
        ServiceProvider provider = new ServiceProvider();

        //�Ѷ˿ڣ�����˵ĵ�ַ  ����zookeeper��
        provider.publish(helloService, host, port);
 
        Thread.sleep(Long.MAX_VALUE);
    }
}