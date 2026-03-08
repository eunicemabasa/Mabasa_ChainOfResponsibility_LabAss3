public class HazardousCollector extends WasteCollector {

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Collecting and safely disposing " + container.getCapacity() + "L of hazardous waste.");
        } else {
            super.collect(container);
        }
    }
}