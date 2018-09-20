//Vincent Li 9/20/2018

package VLi;

import static VLi.VLiLib.*;

public class TestFile
{
    public static void main(String[] args)
    {
        //There is no b inside catatonic cat and as such the line that gets printed is just catatonic cat
        println(cutOut("catatonic cat","b"));

        //While there is multiple cat inside catatonic cat, only the first one is removed leaving atonic cat
        println(cutOut("catatonic cat","cat"));

        //This is simple enough, if the string is entered in the format of 04/20/2001 then it returns it as 20/04/2001
        println(dateStr("04/20/2001"));

        //This prints 5 lines, the first 4 multiples of 4 (except 0)
        multiplicationTable(4,4);

        //The method adds all numbers from 0 to 10 and results in 55.
        println(sumUpTo(10));

        //The method checks the three integers for divisibility first and repeats until it finds an integer capable dividing evenly between the three integers.
        //It returns 6 in this case.
        println(leastCommonMultiple(2,5,3));

    }
}
