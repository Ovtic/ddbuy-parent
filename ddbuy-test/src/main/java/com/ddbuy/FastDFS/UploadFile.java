package com.ddbuy.FastDFS;

import org.csource.fastdfs.*;

public class UploadFile {
    /* 上传文件 */
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
            //6.上传图片
            String[] names = storageClient.upload_file("D:\\图片\\琉璃神社壁纸包 2015年09月号\\11.jpg",
                    "jpg", null);
            System.out.println("上传成功");
            for(String temp:names){
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
