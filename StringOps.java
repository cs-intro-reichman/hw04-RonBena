import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String[] strings = {
                "Hello world",
                "Hello worLd",
                "Hello world",
                "Hello world",
                "MMMM",
                // Add more test cases as needed
        };
        char[] characters = {'l', 'l', 'o', ' ', 'M', 'M'};
    
        int[][] expectedResults = {
                {2, 3, 9},
                {2, 3},
                {4, 7},
                {5},
                {0, 1, 2, 3}
        };
    
        int[] result = StringOps.allIndexOf(strings[1], characters[1]);
    
        System.out.println(Arrays.toString(result));
    };

    public static String capVowelsLowRest (String string) {
    
            String ans ="";
            for (int i = 0; i < string.length(); i++) {
                 char current = string.charAt(i);
                 boolean change =true;
                 if  (current==' ' || "AEIOU".indexOf(current)!=-1 ) 
                 {
                    ans+=current;
                 }
                    else if (current==' ' && current+1< 'a' ||  current+1< 'a')
                    {
                        ans+=(char) (current + 32);
                        change =false;
                    } 
                        else if ("aeiou".indexOf(current) != -1) 
                        {
                            ans += (char) (current - 32);
                            change =false;
                        }
                            else if (current==' ') 
                            {
                                ans+=current;
                                change =false;
                            } 
                                else if (change )
                                {
                                ans+=current;
                }
        }
        return ans;
    }

    public static String camelCase (String string) {
        String ans="";
        int count=0;
        boolean afterspace=false;
        string=deleteSpaces(string);
        if(string.charAt(0)<'Z')
        ans += (char) (string.charAt(0)+32);
        else
        ans += string.charAt(0);
        for(int i = 1; i <string.length();i++)
        {
            if(string.charAt(i) != ' ' && afterspace == false)
            {
                if(string.charAt(i)<'Z')
                    ans += (char) (string.charAt(i)+32);
                    else
                        ans += string.charAt(i);
            }
            if(string.charAt(i) == ' ')
            afterspace = true;
            if(string.charAt(i) >'A'-1 && afterspace == true)
            {
                if(string.charAt(i)>'Z')
                    ans += (char) (string.charAt(i)-32);
                    else
                        ans += string.charAt(i);
                        afterspace = false;
            }
            
        }

        
        return ans;
    }
    public static String deleteSpaces(String string) {
        int i = 0;
        while (string.charAt(i) == ' ') {
            i++;
        }
        return string.substring(i);
    }
    

    public static int[] allIndexOf (String string, char chr) {
        
        int count = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i)==chr)
            count++;
        }
        int [] arr = new int [count];
        int spot=0;
        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i)==chr)
            {
            arr [spot]=i;
            spot++;
            }
        }

        return arr;
    }
}
