package oct.exe_10102024;

public class Lab003 {
    public static void main(String args[])
    {
        int count = 987;                         //Decimal Integer
        int hexaVal = 0x7e4;                    //Hexa-Decimal Integer
        int octalVal = 067;                    // Octel Integer
        int binary = 0b11010;                 //Binary Interger

        float floatVal = 4534.99f;            //floating point literal
        double cost = 19765.567;             //double literal


        char alpha = 'p';                    //Character literal
        char ch1 = '\u0021';
        char ch2 = 1456;

        String str = "Java";                  //String Literal
        String stuName = null;

        boolean boolVal = true;               //Boolean Literal




        System.out.println(count);
        System.out.println(floatVal);
        System.out.println(cost);
        System.out.println(hexaVal);
        System.out.println(binary);
        System.out.println(alpha);
        System.out.println(str);
        System.out.println(boolVal);
        System.out.println(octalVal);
        System.out.println(stuName);
        System.out.println(ch1);
        System.out.println("\t" +"backslash literal");
        System.out.println(ch2);
    }
}

