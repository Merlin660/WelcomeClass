package com.wangml.MyPro04;

/**
 * 构造方法与重载：定义一个网络用户类，信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入，
 * 其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 */
class NetUser {
    int ID;
    int pwd;
    String emailAd;
    NetUser(int ID, int pwd) {
        this.ID = ID;
        this.pwd = pwd;
        emailAd = this.ID + "@gameschool.com";
    }
    NetUser(int ID, int pwd, String emailAd) {
        this(ID, pwd);
        this.emailAd = emailAd;
    }

    public void Test() {
        System.out.println(ID + "\t" + pwd + "\t" + emailAd);
    }
}
public class Final {
    public static void main(String[] args) {
        NetUser n1 = new NetUser(123456,123456);
        NetUser n2 = new NetUser(123456,123456, "123456@163.com");
        n1.Test();
        n2.Test();
    }
}