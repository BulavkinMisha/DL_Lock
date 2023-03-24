public class Snys {
        static class Aue {

            private final String name;
            public Aue(String name) {
                this.name = name;
            }
            public String getName() {
                return this.name;
            }
            public synchronized void sorry(Aue bruh) {
                System.out.format("%s - hate Niggers!%n",
                        this.name, bruh.getName());
                bruh.bowBack(this);
            }
            public synchronized void bowBack(Aue bruh) {
                System.out.format("%s - hate Niggers!%n",
                        this.name, bruh.getName());
            }
        }
}
