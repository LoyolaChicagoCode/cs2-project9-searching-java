package edu.luc.cs.cs271.lab7;

import static org.junit.Assert.*;

import java.util.Set;
import org.junit.Test;

public class TestStation {

  Station makeStationFixture(
      final String name, final Set<Line> lines, final double lat, final double lon) {
    return new Station(name, lines, lat, lon);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorValidName() {
    new Station(null, Set.of(Line.BLUE), 42, -87);
  }

  // TODO testConstructorValidLines
  // TODO testConstructorValidLat/Lon

  @Test
  public void testGetName() {
    final String name = "Oakton";
    final Station t = makeStationFixture(name, Set.of(Line.YELLOW), 42, -87);
    assertEquals(name, t.getName());
  }

  // TODO testGetLines
  // TODO testGetLat/Lon
}
