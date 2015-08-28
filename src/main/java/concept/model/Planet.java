package concept.model;

public class Planet extends SpaceObject {
    private boolean habitability;

    public boolean isHabitability() {
        return habitability;
    }

    public void setHabitability(boolean habitability) {
        this.habitability = habitability;
    }
}
