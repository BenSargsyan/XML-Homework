import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XMLService
{
    private static final String pathName="info.xml";
    public static Computer deseriaize()
    {
        Computer c=null;
        FileInputStream fis=null;
        XMLDecoder d=null;
        try{
            fis=new FileInputStream(pathName);
            d=new XMLDecoder(fis);
            c = (Computer) d.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(d!=null)
                    d.close();
            }
            catch(Exception e){
                e.printStackTrace();
        }
            try{
                if(fis!=null)
                    fis.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return c;
    }
    public static void serialize(Computer c) {
        FileOutputStream fos=null;
        XMLEncoder encoder=null;
        try {
            fos = new FileOutputStream("info.xml");
            encoder = new XMLEncoder(fos);
            encoder.writeObject(c);
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally
        {
            try
            {
                if(encoder!=null)
                    encoder.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
