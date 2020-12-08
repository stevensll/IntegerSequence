import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    private int currentIndex;
    private int[] data;
    public ArraySequence(int [] other){
        data = new int[other.length];
        for (int i = 0; i < other.length; i++){
            data[i] = other[i];
        }
        currentIndex = 0;
    }
    public ArraySequence(IntegerSequence otherseq){
        otherseq.reset();
        data = new int[otherseq.length()];
        for (int i = 0; i < otherseq.length(); i++){
            data[i] = otherseq.next();
        }
        otherseq.reset();
        currentIndex = 0;
    }
    public boolean hasNext(){
        return currentIndex <= data.length-1;
    }
    public int next(){
        if (!hasNext()) throw new NoSuchElementException("No next value in sequence.");
        currentIndex++;
        return data[currentIndex-1];
    }
    public int length(){
        return data.length;
    } 
    public void reset(){
        currentIndex = 0;
    }

}
