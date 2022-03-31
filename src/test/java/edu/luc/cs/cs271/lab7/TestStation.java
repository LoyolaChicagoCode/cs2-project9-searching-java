package edu.luc.cs.cs271.lab7;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TestStation {
  
  Station makeStationFixture(final String name, final Set<Line> lines, final double lat, final double lon) {
    return new Station(name, lines, lat, lon);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Station(null, Set.of(Line.BLUE), 42, -87);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
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