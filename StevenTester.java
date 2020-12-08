import java.util.NoSuchElementException;

public class StevenTester {
    public static void main(String args[]){
        /*
        IntegerSequence a = new Range(10,15);
        IntegerSequence b = new Range(1,15);
        IntegerSequence c = new Range(-30,15);
        String aAsString = "10, 11, 12, 13, 14, 15";
        String bAsString = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15";
        String cAsString = "";
        for(int i = -30; i < 16; i++){
            if (i!=15) cAsString += i + ", ";
            else cAsString+=i;
        }
        
        String testOut = "good";
        if (a.length() != 6) throw new Error("a.length() does not match with length 6.");
        if (b.length() != 15) throw new Error("b.length() does not match with length 15.");
        if (c.length() != 46) throw new Error("c.length() does not match with length 46.");
        System.out.println("Length test: " + testOut);
        if (!sequenceToString(a).equals(aAsString)) throw new Error("failure calling hasNext() and/or next() on IntegerSequence a");
        if (!sequenceToString(b).equals(bAsString)) throw new Error("failure calling hasNext() and/or next() on IntegerSequence b");
        if (!sequenceToString(c).equals(cAsString)) throw new Error("failure calling hasNext() and/or next() on IntegerSequence c");
        System.out.println("hasNext() and next() test: " + testOut);

        testOut = "reset() test: good";
        try{
            b.reset();
            b.next();
        }
        catch (NoSuchElementException e){
            testOut = "reset() failed on IntegerSequence b";
        }
        System.out.println(testOut);
        */
        int[]nums = {1,3,5,0,-1,3,9};
        int[]nums2 = {93, 94, 0, 21, -3};
        IntegerSequence a1 = new ArraySequence(nums);
        IntegerSequence a2 = new ArraySequence(nums2);
        System.out.println("constructor test: good");

        if(a1.length()!=7) throw new Error("a1.length() does not match with length 7.");
        if(a2.length()!=5) throw new Error("a1.length() does not match with length 7.");


        IntegerSequence r = new Range(-20,50);
        IntegerSequence boo = new ArraySequence(r);
        System.out.println(boo.length());
        System.out.println("ArraySequence(seq):");
        while(boo.hasNext()){
            System.out.print(boo.next()+", ");
          }
          System.out.println();
    }

    public static String sequenceToString(IntegerSequence r){
        String str = "";
        while(r.hasNext()){
            str+=r.next();
            if(r.hasNext())str+=", ";
        }
        return str;
    }
}
