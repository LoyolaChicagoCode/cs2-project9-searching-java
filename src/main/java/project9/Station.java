package project9;

import java.util.Set;

/** A CTA train station. */
public class Station {

  public static final String city = "Chicago";
  public static double fare = 2.25;

  public static final double LOOP_LAT = 41.88204;
  public static final double LOOP_LON = -87.62790;

  /** This station's latitude in degrees. */
  private final double lat;

  /** This station's longitude in degrees. */
  private final double lon;

  /** This station's name. */
  private final String name;

  /** Set of train lines this station serves. */
  private final Set<Line> lines;

  /** Constructs a new station. */
  public Station(final String name, final Set<Line> line, final double lat, final double lon) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // TODO validity checking for all other constructor arguments
    this.name = null;
    this.lines = null;
    this.lat = -1;
    this.lon = -1;
    // TODO complete this constructor
  }

  /** Returns the station's name. */
  public String getName() {
    // TODO complete this method
    return null;
  }

  /** Returns the station's geographical latitude. */
  public double getLat() {
    // TODO complete this method
    return -1;
  }

  /** Returns the station's geographical longitude. */
  public double getLon() {
    // TODO complete this method
    return -1;
  }

  /** Returns the lines this station serves. */
  public Set<Line> getLines() {
    // TODO complete this method
    return null;
  }
}
