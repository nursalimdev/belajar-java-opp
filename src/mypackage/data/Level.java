package mypackage.data;

public enum Level {
    STANDARD("Standard"),
    PREMIUM("Premium"),
    VIP("VIP");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
