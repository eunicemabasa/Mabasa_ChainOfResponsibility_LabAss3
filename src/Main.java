public class Main {
    public static void main(String[] args) {
        // Initialize collectors
        OrganicCollector organic = new OrganicCollector();
        RecyclableCollector recyclable = new RecyclableCollector();
        HazardousCollector hazardous = new HazardousCollector();

        // Set up chain: organic -> recyclable -> hazardous
        organic.setNext(recyclable).setNext(hazardous);

        // Create waste containers
        WasteContainer[] containers = {
                new WasteContainer("organic", 50),
                new WasteContainer("recyclable", 30),
                new WasteContainer("hazardous", 10),
                new WasteContainer("electronic", 5) // unsupported type
        };

        // Process each container through the chain
        for (WasteContainer container : containers) {
            organic.collect(container);
        }
    }
}