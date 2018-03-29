public enum FunctionRoomSetup {


        BOARDROOM(3),
        BANQUET(7),
        CLASSROOM(6),
        DINING(4),
        THEATER(10),
        TRADESHOW(1);

        private final int capacityModifier;

        FunctionRoomSetup(int capacityModifier) {
            this.capacityModifier = capacityModifier;
        }

        public int getCapacityModifier() {
            return capacityModifier;
        }
    }

// http://www.confpeople.co.uk/free-venue-finding/room-capacity-calculator

