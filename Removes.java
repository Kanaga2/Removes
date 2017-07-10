# Removes
 import java.io.*;
import java.util.*;
public class Removes
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    s=s.replaceAll("\\s+", " ");
    System.out.println(s);
  }
}
