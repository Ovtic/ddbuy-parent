package com.ddbuy.FastDFS;

import org.csource.fastdfs.*;

public class DelFile {
    /* 删除文件 */
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
            //6.删除图片
            int temp = storageClient.delete_file("group1",
                    "M00/00/00/wKgBHl2IiMWABVlfAD106aotarA159.jpg");
            System.out.println("删除"+temp+"张图片成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
