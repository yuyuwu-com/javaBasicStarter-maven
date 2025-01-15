import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        print("This is a sentence");
    }

    public static void print(Object object)
    {
        if (object == null)
        {  System.out.println("null");  }
        else if (object.getClass().isArray())
        {  System.out.println(Arrays.toString((Object[]) object));  }
        else
        {  System.out.println(object.toString());  }
    }

}