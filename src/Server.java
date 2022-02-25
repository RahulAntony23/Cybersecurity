import java.net.*;
import java.io.*;

public class DecryptServer {

    private Socket socket = null;
    private ServerSocket serverSocketer = null;
    private DataInputStream in = null;

    public DecryptServer(int port){
         try{
             serverSocketer = new ServerSocket(port);

             System.out.println("server started");

             System.out.println("Waiting for client");

             socket = serverSocketer.accept();
             System.out.println("CLient accepted");

             in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

             String line = "";

             while (!line.equals("Over")){
                 try {
                     line = in.readUTF();
                     System.out.println("Message to be decrypted : "+line);
                     String Newstr="";


                     for (int i=0;i<line.length();i++)
                     {
                         char ch=Character.toLowerCase(line.charAt(i));
                         switch (ch)
                         {
                             case '{':
                                 Newstr=Newstr+"A";
                                 break;
                             case '}':
                                 Newstr=Newstr+"B";
                                 break;
                             case '#':
                                 Newstr=Newstr+"C";
                                 break;
                             case '~':
                                 Newstr=Newstr+"D";
                                 break;
                             case '+':
                                 Newstr=Newstr+"E";
                                 break;
                             case '-':
                                 Newstr=Newstr+"F";
                                 break;
                             case '*':
                                 Newstr=Newstr+"G";
                                 break;
                             case '@':
                                 Newstr=Newstr+"H";
                                 break;
                             case '/':
                                 Newstr=Newstr+"I";
                                 break;
                             case '\\':
                                 Newstr=Newstr+"J";
                                 break;
                             case '?':
                                 Newstr=Newstr+"K";
                                 break;
                             case '$':
                                 Newstr=Newstr+"L";
                                 break;
                             case '!':
                                 Newstr=Newstr+"M";
                                 break;
                             case '^':
                                 Newstr=Newstr+"N";
                                 break;
                             case '(':
                                 Newstr=Newstr+"O";
                                 break;
                             case ')':
                                 Newstr=Newstr+"P";
                                 break;
                             case '<':
                                 Newstr=Newstr+"Q";
                                 break;
                             case '>':
                                 Newstr=Newstr+"R";
                                 break;
                             case '=' :
                                 Newstr=Newstr+"S";
                                 break;
                             case ';':
                                 Newstr=Newstr+"T";
                                 break;
                             case ',':
                                 Newstr=Newstr+"U";
                                 break;
                             case '_' :
                                 Newstr=Newstr+"V";
                                 break;
                             case '[':
                                 Newstr=Newstr+"W";
                                 break;
                             case ']' :
                                 Newstr=Newstr+"X";
                                 break;
                             case ':':
                                 Newstr=Newstr+"Y";
                                 break;
                             case '\"' :
                                 Newstr=Newstr+"Z";
                                 break;
                             case '1':
                                 Newstr=Newstr+"r";
                                 break;
                             case '2':
                                 Newstr=Newstr+"k";
                                 break;
                             case '3':
                                 Newstr=Newstr+"b";
                                 break;
                             case '4':
                                 Newstr = Newstr+"e";
                                 break;
                             case '5':
                                 Newstr = Newstr+"q";
                                 break;
                             case '6':
                                 Newstr = Newstr+"h";
                                 break;
                             case '7':
                                 Newstr = Newstr+"u";
                                 break;
                             case '8' :
                                 Newstr= Newstr+"y";
                                 break;
                             case '9':
                                 Newstr = Newstr+"w";
                                 break;
                             case '0':
                                 Newstr = Newstr+"z";
                                 break;
                             default:
                                 Newstr=Newstr+"0";
                                 break;
                         }
                     }
                     System.out.println("Decrypted message is : "+Newstr);
                 }

                 catch (IOException i){
                     System.out.println(i);
                 }
             }
         }

         catch (IOException i){
             System.out.println(i);
         }
    }

    public static void main(String[] args) {
        DecryptServer s = new DecryptServer(5000);
    }


}
