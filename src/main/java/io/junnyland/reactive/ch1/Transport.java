package io.junnyland.reactive.ch1;

import java.math.BigDecimal;

public abstract class Transport {
    protected final Fee fee;
    protected final Device device;

    abstract Transport visit(BigDecimal money);

    Transport(Fee fee, Device device) {
        this.fee = fee;
        this.device = device;
    }

    class Bus extends Transport {

        @Override
        Transport visit(BigDecimal money) {
            return null;
        }

        Bus(Device device) {
            super(Fee.by(BigDecimal.valueOf(1000L)), device);
        }
    }

    class SubWay extends Transport {

        @Override
        Transport visit(BigDecimal money) {
            return null;
        }

        SubWay(Fee fee, Device device) {
            super(fee, device);
        }
    }

    static class Device {
        private BigDecimal total;

        Device(BigDecimal fee){
            this.total = fee;
        }

        public static Device collect(BigDecimal fee){
            return new Device(fee);
        }
    }
    static class Fee {
        private final BigDecimal amount;

        private Fee(BigDecimal amount){
            if (amount == null){
                throw new IllegalArgumentException("금액 잘 쳐넣기");
            }
            this.amount = amount;
        }
        public static Fee by(BigDecimal amount){
            return new Fee(amount);
        }
    }
}
