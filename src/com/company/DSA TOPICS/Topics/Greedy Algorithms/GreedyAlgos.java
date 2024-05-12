import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meeting{
    int start;
    int end;
    meeting(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class meetingComparator implements Comparator<meeting>{
    @Override
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end){
            // if obj1 end is less than the obj2 end that means obj1 comes before obj2
            return -1; // this means obj1 comes before obj2
        }
        else if(o1.end>o2.end){
            // if obj1 end is greater than obj2 end that means obj1 comes after obj2
            return 1; // this means obj1 comes after obj2
        }
        return 0; // so obj1 and obj2 positions not changed
    }
}
public class GreedyAlgos{
    public static void main(String[] args) {
        // N meetings in one room
        // int n = 6;
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {6,8,3,11,2,1};
        // ArrayList<meeting> meet=new ArrayList<>();

        // for(int i=0;i<n;i++) meet.add(new meeting(start[i],end[i]));

        // meetingComparator mc=new meetingComparator();
        // Collections.sort(meet,mc);
        
        // int ansEnd=meet.get(0).end;
        // int count=1;

        // for(int i=1;i<n;i++){
        //     int nextStart=meet.get(i).start;
        //     if(nextStart>ansEnd){
        //         count++;
        //         ansEnd=meet.get(i).end;
        //     }
        // }
        // System.out.println(count);


    }
}