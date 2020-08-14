package com.wangml.MyPro10;

import java.io.File;

/**
 * 使用递归获取文件夹名
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("E:\\用户\\Android");
        printFile(file,0);
    }

    static void printFile(File file, int level) {
        //输出层次
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        //输出文件名
        System.out.println(file.getName());
        //如果file是目录，则获取子文件名列表
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File temp:files) {
                printFile(temp,level+1);
            }
        }

    }
}
