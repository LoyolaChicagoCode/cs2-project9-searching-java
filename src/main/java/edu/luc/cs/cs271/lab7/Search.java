package edu.luc.cs.cs271.lab7;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the index of the named station in an array. */
  public static Optional<Integer> findStationPosition(final Station[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the index of the named station in a list. */
  public static Optional<Integer> findStationPosition(final List<Station> list, final String key) {
    // TODO complete this method
    return Optional.empty();
  }
  
  /** 
   * Looks for the index of the closest station north of the specified latitude.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findStationMinLatitude(final Station[] arr, final double minLatitude) {
    // TODO complete this method
    return Optional.empty();
  }
  
  /**
   * Looks for the index of the closest station north of the specified latitude.
   * Uses binary search: Initially consider the entire index range,
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findStationMinLatitudeFast(final Station[] arr, final double minLatitude) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially consider the entire index range of the array
    int low = 0;
    int high = size - 1;
    // Keep going as long as there is more than one item to be checked
    // Eliminate the wrong half of the array
    // Return current item only if it meets the condition!
    if (low <= high && arr[low].getLat() >= minLatitude) {
      return Optional.of(low);
    } else {
      return Optional.empty();
    }
  }
}
