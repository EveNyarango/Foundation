package oi.turntabl.functional_programming.immutability;

public class ImmutableAccount {

    private final long balance;

    public ImmutableAccount(long balance) {
//        validate(balance);
        this.balance = balance;
    }
    public ImmutableAccount withdraw(long amount){
        long newBalance = newBalance(amount);
        return new ImmutableAccount(newBalance);
    }

    private long newBalance(long amount) {
        return 0l;
    }

    public static final class ImmutableSpaceship {
        private final String name;
        private final Destination destination;

        public ImmutableSpaceship(String name) {
            this.name = name;
            this.destination = Destination.NONE;
        }

        public ImmutableSpaceship(String name, Destination destination) {
            this.name = name;
            this.destination = destination;
        }


        public ImmutableSpaceship Destination(Destination newDestination){
            return new ImmutableSpaceship(this.name, Destination.OUTER_SPACE);

        }

        public ImmutableSpaceship exploreGalaxy(){
            return new ImmutableSpaceship(name, Destination.OUTER_SPACE);
        }
    }
}
