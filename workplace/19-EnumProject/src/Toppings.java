public enum Toppings {

    TOMATO, PEPPER, ONION, PINEAPPLE, MUSHROOM;

    public double getPrice() {

        switch (this) {
            case TOMATO: return 0.50;
            case PEPPER: return 0.35;
            case ONION: return 0.40;
            case PINEAPPLE: return 0.55;
            case MUSHROOM: return 0.45;
            default: return 0;
        }
    }
}
