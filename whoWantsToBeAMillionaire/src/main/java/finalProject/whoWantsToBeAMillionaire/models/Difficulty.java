package finalProject.whoWantsToBeAMillionaire.models;

public enum Difficulty {

    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7);

    private int value;

    Difficulty(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    };

    public static Difficulty getDifficultyByOrdinal(int ordinal){
        return Difficulty.values()[ordinal];
    }



}
