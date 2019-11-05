import org.csource.fastdfs.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println(123);
     // add();
       del();

    }

    private static void add() throws Exception {
        //1加载配置文件
        ClientGlobal.init("D:\\20190225\\code02\\easybuy-parent\\fastdfs\\src\\main\\resources\\client.conf");
        //2构建一个管理客户端
        TrackerClient client = new TrackerClient();
        //3连接管理服务器
        TrackerServer trackerServer = client.getConnection();
        //声明服务端
        StorageServer storageServer=null;
        //获取存储的服务器端对象
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        String[] jpgs = storageClient.upload_file("D:\\1.jpg", "jpg", null);
        for (String   path:jpgs){
            System.out.println(path);
        }
    }

    private static void del() throws Exception {
        //1加载配置文件
        ClientGlobal.init("D:\\20190225\\code02\\easybuy-parent\\fastdfs\\src\\main\\resources\\client.conf");
        //2构建一个管理客户端
        TrackerClient client = new TrackerClient();
        //3连接管理服务器
        TrackerServer trackerServer = client.getConnection();
        //声明服务端
        StorageServer storageServer=null;
        //获取存储的服务器端对象
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        int group1 = storageClient.delete_file("group1", "M00/00/00/wKh-gl2oKyyALEHEAAANt6E7Jfs942.jpg");
        System.out.println("删除成功"+group1);
    }
}
