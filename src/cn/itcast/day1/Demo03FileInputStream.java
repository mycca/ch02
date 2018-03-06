package cn.itcast.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  文件字节输出流：FileInputStream
 * 		构造方法：
 * 			public FileInputStream(File file)throws FileNotFoundException。
 * 			public FileInputStream(String name)throws FileNotFoundException。
 * 		主要方法：
 * 			public int read() throws IOException  一次读取一个字节
 * 			public int read(byte[] b) throws IOException 一次读取一个字节数组  返回值为本次读到的字节个数
 */
public class Demo03FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("test.txt");
		int b = 0;
		while (true) {
			b = in.read();
			if (b == -1) {
				break;
			}
			System.out.println(b);
		}

		in.close();
	}
}
