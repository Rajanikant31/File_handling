import java.io.*;
public class filereader
{
    public static void main(String[] args) throws Exception
    {

        FileReader fr =
                new FileReader("C:\\Users\\Rajanikant\\Documents\\3 sept 2021.txt");

        int i;
        while ((i=fr.read()) != -1)
            System.out.print((char) i);
    }
}