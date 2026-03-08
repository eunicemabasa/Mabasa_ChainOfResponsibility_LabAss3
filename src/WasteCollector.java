public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public WasteCollector setNext(WasteCollector collector) {
        this.nextCollector = collector;
        return collector;
    }

    public void collect(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for " + container.getType() + " waste!");
        }
    }
}