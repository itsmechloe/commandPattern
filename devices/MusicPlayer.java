package devices;

public class MusicPlayer {
    private final String playlist;

    public MusicPlayer(String playlist) {
        this.playlist = playlist;
    }

    public void play() {
        System.out.println("Playing the " + playlist + " playlist.");
    }
}