import org.junit.Assert;
import org.junit.Test;
import java.util.Collections;

import java.util.ArrayList;
import static org.junit.Assert.*;
public class repeatedFindingUnitTest {
    @Test
    public void q1Test() {

        q1RepeatedItemFinding obj=new q1RepeatedItemFinding();
        ArrayList<Integer> testList=new ArrayList<Integer>();
        ArrayList<Integer> actual=new ArrayList<Integer>();
        int[] numbers={5,5,6,7,11,34,56,78,5,78,34,5,7};
        int[] duplicatnum={5,78,34,7};

        for(int element:numbers)
            testList.add(element);
        for (int element2:duplicatnum)
            actual.add(element2);
        ArrayList<Integer> result =obj.repeatedFinding(testList);
        Collections.sort(result);
        Collections.sort(actual);
        Assert.assertArrayEquals(actual.toArray(),result.toArray());
    }
}
