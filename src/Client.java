import java.net.*;
import java.io.*;


 class EncryptClient {

    private Socket s = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public EncryptClient(String address, int port) {

        try {
            s = new Socket(address, port);
            System.out.println("Connected");

            input = new DataInputStream(System.in);

            output = new DataOutputStream(s.getOutputStream());
        }

        catch (UnknownHostException u){
            System.out.println(u);
        }

        catch (IOException i){
            System.out.println(i);
        }

        String line = "";

        while (!line.equals("Over")){
            try {
                System.out.println("Enter text to be encrypted");
                line = input.readLine();
                String Newstr="";
                for (int i=0;i<line.length();i++) {
                    char ch = Character.toLowerCase(line.charAt(i));
                    switch (ch) {
                        case 'a':
                            Newstr = Newstr + "{";
                            break;
                        case 'b':
                            Newstr = Newstr + "}";
                            break;
                        case 'c':
                            Newstr = Newstr + "#";
                            break;
                        case 'd':
                            Newstr = Newstr + "~";
                            break;
                        case 'e':
                            Newstr = Newstr + "+";
                            break;
                        case 'f':
                            Newstr = Newstr + "-";
                            break;
                        case 'g':
                            Newstr = Newstr + "*";
                            break;
                        case 'h':
                            Newstr = Newstr + "@";
                            break;
                        case 'i':
                            Newstr = Newstr + "/";
                            break;
                        case 'j':
                            Newstr = Newstr + "\\";
                            break;
                        case 'k':
                            Newstr = Newstr + "?";
                            break;
                        case 'l':
                            Newstr = Newstr + "$";
                            break;
                        case 'm':
                            Newstr = Newstr + "!";
                            break;
                        case 'n':
                            Newstr = Newstr + "^";
                            break;
                        case 'o':
                            Newstr = Newstr + "(";
                            break;
                        case 'p':
                            Newstr = Newstr + ")";
                            break;
                        case 'q':
                            Newstr = Newstr + "<";
                            break;
                        case 'r':
                            Newstr = Newstr + ">";
                            break;
                        case 's':
                            Newstr = Newstr + "=";
                            break;
                        case 't':
                            Newstr = Newstr + ";";
                            break;
                        case 'u':
                            Newstr = Newstr + ",";
                            break;
                        case 'v':
                            Newstr = Newstr + "_";
                            break;
                        case 'w':
                            Newstr = Newstr + "[";
                            break;
                        case 'x':
                            Newstr = Newstr + "]";
                            break;
                        case 'y':
                            Newstr = Newstr + ":";
                            break;
                        case 'z':
                            Newstr = Newstr + "\"";
                            break;
                        case ' ':
                            Newstr = Newstr + " ";
                            break;
                        case '.':
                            Newstr = Newstr + '3';
                            break;
                        case ',':
                            Newstr = Newstr + "1";
                            break;
                        case '(':
                            Newstr = Newstr + '4';
                            break;
                        case '\"':
                            Newstr = Newstr + '5';
                            break;
                        case ')':
                            Newstr = Newstr + "7";
                            break;
                        case '?':
                            Newstr = Newstr + "2";
                            break;
                        case '!':
                            Newstr = Newstr + "8";
                            break;
                        case '-':
                            Newstr = Newstr + "6";
                            break;
                        case '%':
                            Newstr = Newstr + "9";
                            break;
                        case '1':
                            Newstr = Newstr + "r";
                            break;
                        case '2':
                            Newstr = Newstr + "k";
                            break;
                        case '3':
                            Newstr = Newstr + "b";
                            break;
                        case '4':
                            Newstr = Newstr + "e";
                            break;
                        case '5':
                            Newstr = Newstr + "q";
                            break;
                        case '6':
                            Newstr = Newstr + "h";
                            break;
                        case '7':
                            Newstr = Newstr + "u";
                            break;
                        case '8':
                            Newstr = Newstr + "y";
                            break;
                        case '9':
                            Newstr = Newstr + "w";
                            break;
                        case '0':
                            Newstr = Newstr + "z";
                            break;
                        default:
                            Newstr = Newstr + "0";
                            break;
                    }
                }

                    System.out.println("Encrypted Message :"+Newstr);
                    output.writeUTF(Newstr);

            }

            catch (IOException i){
                System.out.println(i);
            }

        }

        try
        {
            input.close();
            output.close();
            s.close();
        }

        catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EncryptClient client = new EncryptClient("127.0.0.01",5000);
    }
}
