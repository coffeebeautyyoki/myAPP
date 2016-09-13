package javaLearn.JavaUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by h_kang on 2016/9/7.
 */
public class IOUtil {
    /**
     * 创建新文件，为满足windows和linux系统，用常量来定义地址分隔符
     * @param Directory 文件夹名
     * @param fileName 文件名
     * @return
     */
    public boolean createFile(String Directory, String fileName)
    {
        String location = Directory + File.separator +fileName;
        File f = new File(location);
        //f.mkdir();//创建directory
        if(f.exists())
            f.delete();
        try{f.createNewFile();}
        catch (IOException e)
        {e.printStackTrace();}
        return true;
    }

    /**
     * 列出所有文件夹下的文件内容，递归执行
     * @param file
     */
    public void FindAllInDirectory(File file)
    {
        if(file!=null) {
            if (file.isDirectory()) {
                File[] files =file.listFiles();
                if(files!=null) {
                    for (File s : files) {
                        FindAllInDirectory(s);
                    }
                }
            } else
                System.out.println(file);
        }
    }

    /**
     * 字节流方式写入或添加内容到文件
     * @param file
     * @throws Exception
     */
    public void WriteContentToFileByStream (String file,Boolean ifNeedAppend) throws Exception
    {
        File f = new File(file);
        OutputStream os =new FileOutputStream(f,ifNeedAppend);
        String input ="Hello World";
        byte[] bytes =input.getBytes();
        os.write(bytes);
        for(byte byteitem : bytes)
        os.write(byteitem);
        os.close();
    }

    /**
     * 字节流方式读取文件
     * @param file
     * @throws Exception
     */
    public void ReadContentFromFileByStream(String file) throws Exception
    {
        File f = new File(file);
        InputStream input = new FileInputStream(f);
        byte[] bytes = new byte[(int)f.length()];
        input.read(bytes);
        input.close();
        System.out.printf("result is"+new String(bytes));
    }

    /**
     * 字节流方式写入内容到文件
     * @param file
     * @param ifNeedAppend
     * @throws Exception
     */
    public void WriteContentToFileByWriter(String file, boolean ifNeedAppend) throws Exception
    {
        File f = new File(file);
        Writer w = new FileWriter(f, ifNeedAppend);
        String input ="Hello world";
        w.write(input);
        w.close();
    }

    /**
     * 字节流方式读取内容
     * @param file
     * @throws Exception
     */
    public void ReadContentFromFileByWriter(String file) throws Exception
    {
        File f = new File(file);
        Reader reader = new FileReader(f);
        char[] c= new char[1024];
        int len = reader.read(c);
        reader.close();
        System.out.printf("the result is"+new String(c,0,len));
    }

    public void Copy(String original, String destination) throws Exception
    {
        File f1 = new File(original);
        File f2 = new File(destination);
        if(!f1.exists())
        {throw new Exception("文件不存在，复制无意义");}
        InputStream input = new FileInputStream(f1);
        OutputStream output = new FileOutputStream(f2);
        int temp =0;
        while( (temp=input.read())!=-1)
        {
            output.write(temp);
        }
    }
}
