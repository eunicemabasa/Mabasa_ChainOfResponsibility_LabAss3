public class RecyclableCollector extends WasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Collecting and recycling " + container.getCapacity() + "L of recyclable waste.");
        } else {
            super.collect(container);
        }
    }
}