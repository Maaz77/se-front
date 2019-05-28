package ir.ac.shirazu.softwareproject;

public enum MealType {
    EMERGENCY , NORMAL ,  FORGET;

    @Override
    public String toString() {
        if(this == NORMAL){
            return "عادی";
        }
        else if(this == EMERGENCY){
            return "اضطراری";
        }
        else {
            return "فراموشی";
        }
    }
}
