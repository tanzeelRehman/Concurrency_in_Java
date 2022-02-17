package ThreadPool;

public class PotatoPeelingTask extends Task{
    private static final int TIME_PER_POTATO = 200;

    public PotatoPeelingTask(int num_of_potato) {
        super(num_of_potato*TIME_PER_POTATO);
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(),
                super.toString());
    }
}
