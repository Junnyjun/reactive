package io.junnyland.reactive.ch2.rx_app;

/**
 * Temperature in Celsius.
 */
public final class Temperature {
   private final double value;

   public Temperature(double value) {
      this.value = value;
   }

   public double getValue() {
      return value;
   }
}
