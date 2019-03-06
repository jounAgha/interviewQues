/**
 * <h1>Finding Duplicate Values in a List</h1>
 *This code find duplicate items in a list and print item and duplicate times

 * @author  Aplicant
 * @version 1.0
 * @since   2019-03-06(yyyy-mm-dd)
 */
import java.util.*;
import java.util.Random;
public class q1RepeatedItemFinding {
    public static void main(String[] args)
    {
        Random ran = new Random();
        ArrayList<Integer> resultArrayL;

        ArrayList<Integer> mainList=new ArrayList<Integer>();
        for(int i=0;i<=50; i++) {
            mainList.add(ran.nextInt(100));
            System.out.print(mainList.get(i)+",");
        }

        q1RepeatedItemFinding obj=new q1RepeatedItemFinding();
        resultArrayL= obj.repeatedFinding(mainList);
        for(int element:resultArrayL)
             System.out.print(element+",");
    }

    public ArrayList<Integer> repeatedFinding(ArrayList<Integer> l1)
    {
        Hashtable<Integer,Integer> tempHashT=new Hashtable<Integer,Integer>();
        ArrayList<Integer> tempArray=new ArrayList<Integer>();
        for(int item:l1)
        {

            if (tempHashT.containsKey(item)) {
                tempHashT.put(item, tempHashT.get(item) + 1);
            } else {
                tempHashT.put(item, 1);
            }

        }
       for(int key: tempHashT.keySet()) {
            if (tempHashT.get(key) >=2)
                   tempArray.add(key);

       }

        return tempArray;
    }
}
