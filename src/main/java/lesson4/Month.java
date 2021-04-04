package lesson4;

public enum Month {
    JAN(1,"January" ),
    FEB(2, "February"),
    MAR(3,"March"),
    APR(4,"April"),
    MAY(5,"May"),
    JUN(6,"June"),
    JUL(7,"July"),
    AUG(8, "August"),
    SEP(9,"September"),
    OCT(10,"October"),
    NOV(11,"November"),
    DEC(12, "December");


    private int monthNaturalIndex;
    private String monthName;
    Month(int monthNaturalIndex, String monthName){
        this.monthNaturalIndex = monthNaturalIndex;
        this.monthName= monthName;
    }

    public int getMonthNaturalIndex() {
        return monthNaturalIndex;
    }

    public String getMonthName() {
        return monthName;
    }

    @Override
    public String toString() {
        return  monthName ;
    }
}