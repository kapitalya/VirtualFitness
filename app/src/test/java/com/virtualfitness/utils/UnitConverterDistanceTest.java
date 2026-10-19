package com.virtualfitness.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitConverterDistanceTest {
    private static final float TOLERANCE = 0.0001f;

    @Test
    public void oneMileConvertsToKnownKilometres() {
        assertEquals(1.609344f, UnitConverter.MilesToKm(1f), TOLERANCE);
    }

    @Test
    public void knownKilometreDistanceConvertsToOneMile() {
        assertEquals(1f, UnitConverter.KmToMiles(1.609344f), TOLERANCE);
    }

    @Test
    public void zeroMilesRemainZero() {
        assertEquals(0f, UnitConverter.MilesToKm(0f), TOLERANCE);
    }

    @Test
    public void zeroKilometresRemainZero() {
        assertEquals(0f, UnitConverter.KmToMiles(0f), TOLERANCE);
    }

    @Test
    public void tenMilesConvertToKnownKilometres() {
        assertEquals(16.09344f, UnitConverter.MilesToKm(10f), TOLERANCE);
    }

    @Test
    public void knownKilometreDistanceConvertsToTenMiles() {
        assertEquals(10f, UnitConverter.KmToMiles(16.09344f), TOLERANCE);
    }

    @Test
    public void milesRoundTripPreservesDistance() {
        assertEquals(10f, UnitConverter.KmToMiles(UnitConverter.MilesToKm(10f)), TOLERANCE);
    }

    @Test
    public void kilometresRoundTripPreservesDistance() {
        assertEquals(10f, UnitConverter.MilesToKm(UnitConverter.KmToMiles(10f)), TOLERANCE);
    }
}
