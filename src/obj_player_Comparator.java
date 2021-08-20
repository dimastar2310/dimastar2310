import java.util.Comparator;

public class obj_player_Comparator implements Comparator<testMatala.obj_player> {

    @Override
    public int compare(testMatala.obj_player o1, testMatala.obj_player o2) {
        if(o1.al.size()==o2.al.size()){
            return 0;
        }
        else if(o1.al.size()>o2.al.size()){
            return 1;

        }
        else
        {
            return -1;
        }
    }
}
