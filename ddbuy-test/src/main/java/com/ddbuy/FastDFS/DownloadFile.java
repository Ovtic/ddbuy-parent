package com.ddbuy.FastDFS;

import org.csource.fastdfs.*;

import java.io.FileOutputStream;

public class DownloadFile {
    /* 下载文件 */
    public static void main(String[] args) {
        try {
            //1.加载属性文件
            ClientGlobal.init("fastdfs.properties");
            //2.创建一个 TrackerClient 对象
            TrackerClient trackerClient = new TrackerClient();
            //3.使用 TrackerClient 对象创建连接，获得一个 TrackerServer 对象
            TrackerServer trackerServer = trackerClient.getConnection();
            //4.创建一个 StorageServer 的引用，值为 null
            StorageServer storageServer = null;
            //5.创建一个 StorageClient 对象，需要两个参数 TrackerServer 对象、StorageServer 的引用
            StorageClient storageClient = new StorageClient(trackerServer,storageServer);
            //6.下载图片
            byte[] bytes = storageClient.download_file("group1",
                    "M00/00/00/wKgBHl2IjEuATo0FAD106aotarA544.jpg");
            //将二进制数据写入文件
            FileOutputStream fos = new FileOutputStream("d:\\d.jpg");
            fos.write(bytes);
            fos.flush();
            fos.close();
            System.out.println("下载成功");
            //关闭
            trackerServer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
