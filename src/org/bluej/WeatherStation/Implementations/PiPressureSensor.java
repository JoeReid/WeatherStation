package org.bluej.WeatherStation.Implementations;

import org.bluej.WeatherStation.Units.Pressure;
import org.bluej.WeatherStation.Sensors.PressureSensor;
import org.bluej.WeatherStation.Drivers.AirPressureTemperature;

import java.io.IOException;

/**
 * Implementation of the pressure driver.
 * Uses {@link AirPressureTemperature}.
 */
public class PiPressureSensor implements PressureSensor {

    /**
     * Driver instance.
     */
    private final AirPressureTemperature driver;

    /**
     * Default constructor.
     */
    public PiPressureSensor() {
        driver = AirPressureTemperature.getInstance();
    }

    /**
     * {@inheritDoc}
     */
    public Pressure getPressure() {
        final int rawPressure = driver.readPressure();
        return new Pressure(rawPressure);
    }
}
