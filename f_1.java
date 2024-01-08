package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class f_1 {
    public static void main(String[] args) throws IOException {
        
        File f1= new File("C:\\Users\\Cecilia\\Documents\\projects\\text1.txt");
        File f2= new File("C:\\Users\\Cecilia\\Documents\\projects\\HI.txt");
        File f3= new File("C:\\Users\\Cecilia\\Documents\\projects\\text2.txt");
        File f4= new File("C:\\Users\\Cecilia\\Documents\\projects\\fo1");
        
        //////The methods://////
        
        //1. exists (it checks if the file or folder exists)
        System.out.println(f1.exists());
        boolean a=f2.exists();
        System.out.println(a);
        System.out.println(f4.exists());
        
        
        
        //2. delete (it delets files and folders)
        boolean L=f1.delete();
        System.out.println(L);
        System.out.println(f1.exists());
        System.out.println(f1.delete());
        /*
        when you use this method twice in the same file or folder
        the first on will be true and the second will always be false
        cause in the second time the file no longer exsists
        */
        
        
        
        //3. getName (to print files or folder name)
        System.out.println(f3.getName());//text2
        String st1=new String(f4.getName());
        System.out.println(st1);//fo1
        
        
        
        //4. getPath (to print the path that stored in the object)
        System.out.println(f3.getPath());
        String st2=new String(f4.getPath());
        System.out.println(st2);
        
        
        
        //5. getAbsulutePath (to print the path direct from the properties)
        System.out.println(f3.getAbsolutePath());
        String st3=new String(f4.getAbsolutePath());
        System.out.println(st3);
        
        
        
        //6. getAbsuluteFile (to connect objects with files or folderes)
        File w=f3.getAbsoluteFile();
        System.out.println(w.exists());//true
        w.delete();
        System.out.println(f3.exists());//false
        
        
        
        File fi1=new File("C:\\Users\\Cecilia\\Documents\\projects\\file1.txt");
        File fi2=new File("C:\\Users\\Cecilia\\Documents\\projects\\file2.text");
        File fol1=new File("C:\\Users\\Cecilia\\Documents\\projects\\folder1");
        
        
        
        //7. getParent (to prints the path of the parent of files and folders)
        System.out.println(fi1.getParent());
        String st4=new String(fi2.getParent());
        System.out.println(st4);
        
        
        
        //8. getParentFile (to connect objects with file's and folder's parent)
        File N=fi1.getParentFile();
        System.out.println(N.exists());//true
        System.out.println(N.getName());//projects
        
        
        
        //9. isDirectory (to check if the path that stored in the object is folder or not)
        System.out.println(fi1.isDirectory());//false
        System.out.println(fol1.isDirectory());//true
        
        
        
        //10. isFile (to check if the path that stored in the object is file or not)
        System.out.println(fi1.isFile());//true
        System.out.println(fol1.isDirectory());//false
        
        
        
        //11. lastModified (to print the last update time of files and folders)
        System.out.println(fi2.lastModified());
        
        
        
        //12. length (to print the SIZE of files in byte)
        System.out.println(fi1.length());//24
        long x=fi1.length();
        System.out.println(x);//24
        
        
        
        //13. list (to print the files and folders that are inside a folder)
        String [] s=fol1.list();//(returns string array)
        for(String i:s)
            System.out.println(i);
        
        
        
        //14. setReadOnly (to set a file as read only)
        System.out.println(fi1.setReadOnly());//true
        System.out.println(fol1.setReadOnly());//false
        
        
        
        //15. mkdir ( [shortcut of make directory] to create folders only)
        File fol2=new File("C:\\Users\\Cecilia\\Documents\\projects\\folder2");
        File fi3=new File("C:\\Users\\Cecilia\\Documents\\projects\\file3.txt");
        /* must be not existed folder/directory */
        System.out.println(fol2.mkdir());//true (for the first time)
        System.out.println(fol1.mkdir());//false
        System.out.println(fi3.mkdir());//true(it created a folder with name[file3.txt])
        
        
        
        //16. createNewFile (to create files only)
        System.out.println(fi3.createNewFile());//true (for the first time)
        System.out.println(fi1.createNewFile());//false
        
        
        
        //17. listFiles (it stores the files and folders that are in a folder in an array of files)
        File fol3 = new File("C:\\Users\\Cecilia\\Documents\\projects\\folder");
        File []arr=fol3.listFiles();
        System.out.println(arr.length);
        for(File f:arr)
            System.out.println(f);
        
            
        }
    }
