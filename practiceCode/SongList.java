import java.util.HashMap;
import java.util.Set;

public class SongList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("other side", "break on thru to the other side");
        trackList.put("The Moon", "oh how you break me in the night");
        trackList.put("Dollars", "You cant take it with you");
        trackList.put("Another brick", "Hey politicans leave those protestors alone");
        String songName = trackList.get("other side");
        System.out.println(songName);
        

        Set<String> keys = trackList.keySet();

        for(String key : keys ) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}
