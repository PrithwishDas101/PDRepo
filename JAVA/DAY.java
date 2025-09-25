package JAVA;

public enum DAY {
    
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    DAY(int dayNumber){

        this.dayNumber = dayNumber;

    }

    public int getDAYNUMBER(){
        return this.dayNumber;
    }
}
