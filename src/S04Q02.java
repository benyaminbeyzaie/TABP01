import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class S04Q02 {
    static boolean[] mark=new boolean[200000];
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String  a=s.nextLine();
        int min=0;
        int temp=0;
        for(int g=0;g<a.length();g++)
        {
            if(a.charAt(g)=='(')
            {
                temp+=2;
            }

            else
            {
                temp-=1;
            }
            if(temp<0)
            {
                temp+=2;
                min++;
            }

        }
        min+=temp;
        System.out.print(min);

    }

}
