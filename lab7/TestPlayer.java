// Interface Playable with play, pause, and stop methods
interface Playable {
    void play();
    void pause();
    void stop();
}

// MusicPlayer class implementing Playable interface
class MusicPlayer implements Playable {
    // Override method to play music
    public void play() {
        System.out.println("Music is playing");
    }

    // Override method to pause music
    public void pause() {
        System.out.println("Music is paused");
    }

    // Override method to stop music
    public void stop() {
        System.out.println("Music is stopped");
    }
}

// Main class to test the implementation
public class TestPlayer {
    public static void main(String[] args) {
        // Create a MusicPlayer object
        MusicPlayer player = new MusicPlayer();

        // Call play, pause, and stop methods
        player.play();
        player.pause();
        player.stop();
    }
}

