package domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean can_PublishFreeCopy;
    private int editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isCan_PublishFreeCopy() {
        return can_PublishFreeCopy;
    }

    public void setCan_PublishFreeCopy(boolean can_PublishFreeCopy) {
        this.can_PublishFreeCopy = can_PublishFreeCopy;
    }

    public int getEditMode() {
        return editMode;
    }

    public void setEditMode(int editMode) {
        this.editMode = editMode;
    }
}
