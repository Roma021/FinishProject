import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            System.out.println("Enter an Artist:");
          String  artist = reader.nextLine();
            System.out.println("Enter a Song title:");
          String  title =reader.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song xxxx: songs){
            System.out.println(xxxx.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song xxxx: songs){
            if (xxxx.getTitle().equalsIgnoreCase(titleToFind)){
                System.out.printf("\nI found %s \r\n",xxxx.display());
            }
        }
    }
}