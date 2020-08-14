package com.wangml.MyPro09.classString;

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        /**StringBuilder*/
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<7;i++){
            sb.append((char)('a' + i));
        }
        System.out.println(sb.toString());
        sb.append(", I can sing my abc!");
        System.out.println(sb.toString());

        /**StringBuffer,下面的方法同样适用于StringBuilder*/
        StringBuffer sb2 = new StringBuffer("北京尚学堂");
        sb2.insert(0,"爱").insert(0,"我");
        System.out.println(sb2);
        sb2.delete(0,2); //删除子字符串,从0开始，2结束，不包括2
        System.out.println(sb2); //北京尚学堂
        sb2.deleteCharAt(0).deleteCharAt(0); //删除某个字符
        System.out.println(sb2); //尚学堂
        System.out.println(sb2.charAt(2)); //获取某个字符
        System.out.println(sb2.reverse()); //字符串逆序


    }
}
