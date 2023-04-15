public class PC {
    private String name;
    private boolean isDamaged;
    public PC(String name) {
        this.name = name;
        this.isDamaged = false;
    }
    public String getName() {
        return name;
    }
    public boolean isDamaged() {
        return isDamaged;
    }
    public void markAsDamaged() {
        isDamaged = true;
    }
    public void markAsNotDamaged() {
        isDamaged = false;
    }
}