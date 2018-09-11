package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorValidName() {
    new Team(null, "Klinsmann", 500);
  }
  
  // TODO testConstructorValidHeadcoach
  // TODO testConstructorValidFunding

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  // TODO testGetHeadcoach
  // TODO testGetFunding
}