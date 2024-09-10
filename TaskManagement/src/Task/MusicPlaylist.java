package Task;
import java.util.LinkedList;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public void removeSong(String song) {
        playlist.remove(song);
    }

    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < playlist.size() && toIndex >= 0 && toIndex < playlist.size()) {
            String song = playlist.remove(fromIndex);
            playlist.add(toIndex, song);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + playlist);
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.displayPlaylist();
        playlist.moveSong(0, 1);
        playlist.removeSong("Song B");
        playlist.displayPlaylist();
    }
}
