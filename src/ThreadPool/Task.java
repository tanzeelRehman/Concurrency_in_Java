package ThreadPool;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();
    private final int id;
    private final int timeMs;

    public Task(int timeMs) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.timeMs = timeMs;
    }
    public int getId() {
        return id;
    }
    public int getTimeMs() {
        return timeMs;
    }
    @Override
    public String toString() {
        return String.format("id = %d time(Ms)= %d", id, timeMs);
    }
}
