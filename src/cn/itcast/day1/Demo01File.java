package cn.itcast.day1;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

// File()：构造函数，一般是依据文件所在的指定位置来创建文件对象。  
//CanWrite()：返回文件是否可写。  
//CanRead()：返回文件是否可读。 
//CompareTo(File pathname)：检查指定文件路径间的顺序。 
//Delet()：从文件系统内删除该文件。 
//DeleteOnExit()：程序顺利结束时从系统中删除文件。 
//Equals(Object obj)：检查特定对象的路径名是否相等。 
//Exists()：判断文件夹是否存在。 
//IsDirectory()：判断该路径指示的是否是文件。 
//IsFile()：判断该路径指示的是否是文件。 
//LastModified() ：返回文件的最后修改时间标志。 
//Length()：返回文件长度。 
//List()：返回文件和目录清单。 
//Mkdir()： 创建文件夹。 
//file.mkdirs();创建此抽象路径名，包括必要的和不存在的父目录的目录。
//RenameTo(File dest)：更名文件。 
//SetReadOnly()：将文件设置为可读。 
//ToString()：返回文件状态的字符串。 
//ToURL()：将文件的路径字符串转换成URL 
//GetAbsoluteFile()：返回抽象路径名的绝对路径名字符串。  
//GetAbsolutePath()：返回文件的完整路径。 
//GetName()：返回文件名称。 
//GetParent()：返回文件父目录路径。 
//GetPath()：返回文件的潜在相对路径。 
//GetParentFile()：返回文件所在文件夹的路径。 
//File.GetCreationTime 读取创建时间 
//file.SetCreationTime 设置创建时间 
//File.GetLastAccessTime   读取最后访问时间 
//File.SetLastAccessTime   设置最后访问时间 
//File.GetLastWriteTime 读取最后修改时间 
//File.SetLastWriteTime 设置最后修改时间 
//File.GetAttributes 读取文件属性 
//File.SetAttributes 设置文件属性
//file.getFreeSpace()返回此抽象路径名指定的分区中未分配的字节数。
//file.getCanonicalFile();返回抽象路径名的规范形式
//file.getCanonicalPath();返回抽象路径名的规范路径名字符串。
//file.getTotalSpace();返回抽象路径名的分区的大小。
//file.getUsableSpace();返回可用字节数
//file.isAbsolute();检查此抽象路径名是否是绝对的
//file.createNewFile()创建新文件
//file.isHidden();检查命名此抽象路径名的文件是否是一个隐藏文件。
//file.listFiles();返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。 即File下的所有文件及目录(File对象)。
//file.lastModified();返回表示抽象路径名的文件的最后修改时间。
//file.setExecutable(executable, ownerOnly);设置所有者对于此抽象路径名执行权限。
//file.setReadable(readable, ownerOnly);设置此抽象路径名的存取权限。
//file.setReadOnly();切换文件为只读模式并拒绝该文件的任何写操作
//file.setWritable(writable, ownerOnly);设置此抽象路径名的所有者的写权限。
//file.toPath();
//file.pathSeparator与系统有关的路径分隔符，为了方便，它被表示为一个字符串
//file.pathSeparatorChar与系统有关的路径分隔符。此字段被初始为包含系统属性 path.separator 值的第一个字符
//file.separator;与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
//file.separatorChar;与系统有关的默认名称分隔符。此字段被初始化为包含系统属性 file.separator 值的第一个字符。
//file.createTempFile(String prefix, String suffix)； 在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称。 
//file.createTempFile(prefix, suffix, directory);在指定目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。 
//file.listRoots();获取所有盘符的文件对象
public class Demo01File {
	public static void main(String[] args) throws IOException {
		// File file = new File("a.txt");
		// System.out.println(file.canExecute());
		// System.out.println(file.canRead());
		// System.out.println(file.canWrite());
		// //file.compareTo
		// //System.out.println(file.createNewFile());
		// //System.out.println(file.createTempFile(prefix, suffix, directory));
		// System.out.println(file.delete());
		// System.out.println(file.exists());
		File dir2 = new File("a/b");
		File file4 = new File(dir2, "a.txt");

	}

}
