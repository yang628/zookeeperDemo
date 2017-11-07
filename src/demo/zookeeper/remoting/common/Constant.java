package demo.zookeeper.remoting.common;
 
public interface Constant {
 
    String ZK_CONNECTION_STRING = "10.211.55.5:2181,10.211.55.6:2181,10.211.55.8:2181";
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/registry";
    String ZK_PROVIDER_PATH = ZK_REGISTRY_PATH + "/provider";
}