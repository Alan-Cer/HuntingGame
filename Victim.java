package HuntingGame;

abstract class Victim {
    String name;
    double chance;

    public Victim(String name, double chance) {
        this.name = name;
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public double getChance() {
        return chance;
    }


    public static Victim getVictim(int choice) {
        switch (choice) {
            case 1: return new Rhino();
            case 2: return new Deer();
            case 3: return new Antilope();
            default: throw new IllegalArgumentException("Invalid choice");
        }
    }


    static class Rhino extends Victim {
        public Rhino() {
            super("\uD83E\uDD8F", 0.12);
        }
    }

    static class Deer extends Victim {
        public Deer() {
            super("\uD83C\uDFF4", 0.25);
        }
    }

    static class Antilope extends Victim {
        public Antilope() {
            super("\uD83E\uDD8C", 0.2);
        }
    }
}



