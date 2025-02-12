
class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }
}


class Cricket_Player extends Player {
    public Cricket_Player(String name) {
        super(name);
    }

    public void play() {
        System.out.println(name + " is playing Cricket.");
    }
}

class Football_Player extends Player {
    public Football_Player(String name) {
        super(name);
    }
    public void play() {
        System.out.println(name + " is playing Football.");
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing Hockey.");
    }
}


public class two {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat");
        Football_Player footballer = new Football_Player("Messi");
        Hockey_Player hockeyPlayer = new Hockey_Player("Gretzky");

        cricketer.play();
        footballer.play();
        hockeyPlayer.play();
    }
}
