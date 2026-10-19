package com.virtualfitness.utils;

import static org.junit.Assert.assertEquals;

import com.virtualfitness.enums.Unit;
import com.virtualfitness.enums.WeightUnit;
import org.junit.Test;

public class UnitConverterWeightTest {
    private static final float TOLERANCE = 0.0001f;

    @Test
    public void fourteenPoundsBecomeOneStoneWithUnit() {
        assertEquals(1f, UnitConverter.weightConverter(14f, Unit.LBS, Unit.STONES), TOLERANCE);
    }

    @Test
    public void oneStoneBecomesFourteenPoundsWithUnit() {
        assertEquals(14f, UnitConverter.weightConverter(1f, Unit.STONES, Unit.LBS), TOLERANCE);
    }

    @Test
    public void fourteenPoundsBecomeOneStoneWithWeightUnit() {
        assertEquals(1f, UnitConverter.weightConverter(14f, WeightUnit.LBS, WeightUnit.STONES), TOLERANCE);
    }

    @Test
    public void oneStoneBecomesFourteenPoundsWithWeightUnit() {
        assertEquals(14f, UnitConverter.weightConverter(1f, WeightUnit.STONES, WeightUnit.LBS), TOLERANCE);
    }

    @Test
    public void existingKilogramsToPoundsRemainCorrect() {
        assertEquals(1f, UnitConverter.weightConverter(0.45359237f, Unit.KG, Unit.LBS), TOLERANCE);
    }

    @Test
    public void existingPoundsToKilogramsRemainCorrect() {
        assertEquals(0.45359237f, UnitConverter.weightConverter(1f, Unit.LBS, Unit.KG), TOLERANCE);
    }

    @Test
    public void existingKilogramsToStonesRemainCorrect() {
        assertEquals(1f, UnitConverter.weightConverter(6.35029f, WeightUnit.KG, WeightUnit.STONES), TOLERANCE);
    }

    @Test
    public void existingStonesToKilogramsRemainCorrect() {
        assertEquals(6.35029f, UnitConverter.weightConverter(1f, WeightUnit.STONES, WeightUnit.KG), TOLERANCE);
    }

    @Test
    public void zeroPoundsRemainZeroWithUnit() {
        assertEquals(0f, UnitConverter.weightConverter(0f, Unit.LBS, Unit.STONES), TOLERANCE);
    }

    @Test
    public void zeroStonesRemainZeroWithUnit() {
        assertEquals(0f, UnitConverter.weightConverter(0f, Unit.STONES, Unit.LBS), TOLERANCE);
    }

    @Test
    public void zeroPoundsRemainZeroWithWeightUnit() {
        assertEquals(0f, UnitConverter.weightConverter(0f, WeightUnit.LBS, WeightUnit.STONES), TOLERANCE);
    }

    @Test
    public void zeroStonesRemainZeroWithWeightUnit() {
        assertEquals(0f, UnitConverter.weightConverter(0f, WeightUnit.STONES, WeightUnit.LBS), TOLERANCE);
    }

}
