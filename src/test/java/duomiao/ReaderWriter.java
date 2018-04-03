package duomiao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderWriter {
	
	public static void main(String[] args) {
		characters();
	/*	try {
			pic();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	private static void characters() {  
		  
        try {  
            FileInputStream  fis = new FileInputStream("F:\\red.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedReader bfr = new BufferedReader(new InputStreamReader(bis,"gbk"));
            /*FileReader fr = new FileReader("F:\\red.txt");  */
            FileWriter fw  = new FileWriter("F:\\wit.txt");
            FileOutputStream fos = new FileOutputStream("F:\\at.txt",true);
            char []  buf = new char[6];   
            //将Denmo中的文件读取到buf数组中。  
            int num = 0;  
            String str;
            fos.write("\r\n".getBytes());
            while((num = fis.read())!=-1){
            	fos.write((char)num);
            }
            
     /*      while((str = bfr.readLine())!=null){
        	   fw.write(str);
        	   fw.write("\r\n");
        	   }*/
    /*        while((num = fr.read(buf))!=-1) {
               String str = new String(buf,0,num);
               fw.write(str);
              
            }  */
            fos.flush();
            fos.close();
           /* fr.close();*/
        }  
        catch (IOException e) {   
        }  
    }  
	private static void pic() throws FileNotFoundException {  
		FileInputStream fis = null;
		FileOutputStream fos = null;
		  try {
			fis = new FileInputStream("F:\\test.png");
			 fos = new FileOutputStream("F:\\test2.png");
			byte[] buf = new byte[20];
			while(fis.read(buf)!=-1){
				fos.write(buf);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
