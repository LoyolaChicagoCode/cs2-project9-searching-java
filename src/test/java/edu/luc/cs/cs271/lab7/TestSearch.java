package edu.luc.cs.cs271.lab7;

import static org.junit.Assert.*;

import java.util.Set;
import org.junit.Test;

public class TestSearch {

  Station[] makeArrayFixture(final int size) {
    final Station[] array = new Station[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      // Stations for testing are evenly spaced north-south about every 1.1 km
      array[i] = new Station("Station " + s, Set.of(Line.RED), 41.9 + 0.01 * i, -87.66);
    }
    return array;
  }

  // TODO makeListFixture

  @Test
  public void testFindPositionArray0() {
    final Station[] arr = makeArrayFixture(0);
    assertFalse(Search.findStationPosition(arr, "Station 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Station[] arr = makeArrayFixture(10);
    assertTrue(Search.findStationPosition(arr, "Station 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Station[] arr = makeArrayFixture(10);
    assertFalse(Search.findStationPosition(arr, "Station 11").isPresent());
  }

  // TODO: testFindPositionList0, 10s, 10f

  // TODO: testFindMinLatitudeArray for several sizes and scenarios

  // TODO: testFindMinLatitudeArrayFast for several sizes and scenarios
}
