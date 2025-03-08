import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];
    public Playlist(){
        favoriteSongs[0] = "Redemption song - Bob Marley";
        favoriteSongs[1] = "Can't help falling in love - Elvis Presley";
        favoriteSongs[2] = "Take on me - A-ha";
        favoriteSongs[3] = "Stand by me - Tracy Chapman";
        favoriteSongs[4] = "At last - Etta James";
        favoriteSongs[5] = "Respect - Aretha Franklin";
        favoriteSongs[6] = "That's life - Frank Sinatra";
        favoriteSongs[7] = "Crazy - Gnarls Barkley";
        favoriteSongs[8] = "What's up - 4 Non Blondes";
        favoriteSongs[9] = "Like a Rolling Stone (LIVE) - Rolling Stone";

        desertIslandPlaylist.add("Many rivers to cross - The Animals");
        desertIslandPlaylist.add("Knockin'on heaven's door - Gunsn N' Roses");
        desertIslandPlaylist.add("Basket case - Green day");
        desertIslandPlaylist.add("Creep - RadioHead");
        desertIslandPlaylist.add("Thinking for you - Davis Guetta");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove("Basket case - Green day");
        desertIslandPlaylist.remove(10);
        desertIslandPlaylist.remove("Thinking for you - Davis Guetta");
        desertIslandPlaylist.remove(9);
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove("That's life - Frank Sinatra");
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(4);

        int songA = desertIslandPlaylist.indexOf("Take on me - A-ha");
        int songB = desertIslandPlaylist.indexOf("Stand by me - Tracy Chapman");

        String tempA = desertIslandPlaylist.get(songA);
        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);

    }
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    public void playSongs(){
        System.out.println("First three songs of favorite list: ");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert island");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());




    }

}
