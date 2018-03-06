package cn.itcast.day1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.Bidi;

/*
 *	高效字节流：
 *		BufferedInputStream
 *		BufferedOutputStream
 *
 *		构造方法：
 *			均要一个对应的流对象
 * 高效字符输出流：
 * 		BufferedWriter：
 * 			public void newLine() throws IOException  换行
 * 

 * 高效字符输入流：
 * 		BufferedReader：
 * 			public String readLine() throws IOException  读取时，判断回车，一次读取一行，返回值不包括回车
 */

public class Demo04Buffere {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src.txt"));

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("des.txt"));
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}
