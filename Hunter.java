package HuntingGame;

public class Hunter {
    String name;
    double chance = 0.3;

    public Hunter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getChance() {
        return chance;
    }


    public static Hunter getHunter(int choice) {
        switch (choice) {
            case 1: return new Lion();
            case 2: return new Leopard();
            case 3: return new Cheetah();
            default: throw new IllegalArgumentException("Invalid choice");
        }
    }


    static class Lion extends Hunter {
        public Lion() {
            super("\uD83E\uDD81");
        }
    }

    static class Leopard extends Hunter {
        public Leopard() {
            super("🐆");
        }
    }

    static class Cheetah extends Hunter {
        public Cheetah() {
            super("\uD83D\uDC06");
            this.chance = 0.4;
        }
    }
}
