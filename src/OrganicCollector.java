public class OrganicCollector extends WasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Collecting and disposing " + container.getCapacity() + "L of organic waste.");
        } else {
            super.collect(container);
        }
    }
}