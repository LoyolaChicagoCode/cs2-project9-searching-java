package edu.luc.cs.cs271.lab7;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    // some red line stations
    final Station loyola = new Station("Loyola", Set.of(Line.RED), 42.001162, -87.660874);
    final Station granville = new Station("Granville", Set.of(Line.RED), 41.994525, -87.659168);
    final Station thorndale = new Station("Thorndale", Set.of(Line.RED), 41.990059, -87.658889);

    // some purple line stations
    final Station belmont = new Station("Belmont", Set.of(Line.RED, Line.PURPLE), 41.939956, -87.653324);
    final Station howard = new Station("Howard", Set.of(Line.RED, Line.PURPLE, Line.YELLOW), 42.019051, -87.672889);
    final Station southBlvd = new Station("South Blvd", Set.of(Line.PURPLE), 42.027240, -87.678277);

    final Station[] array = { loyola, granville, thorndale, belmont, howard, southBlvd };
    final List<Station> list = Arrays.asList(array);

    final Scanner keyboard = new Scanner(System.in);

    // Get station name
    System.out.print("Enter station to search for: ");
    final String key = keyboard.nextLine();
    System.out.println("Looking for station " + key);

    // Runs the linear search on the array
    final Optional<Integer> index1 = Search.findStationPosition(array, key);
    checkStationArrayIndex(array, index1);
    
    // Runs the linear search on the list
    final Optional<Integer> index2 = Search.findStationPosition(list, key);
    checkStationListIndex(list, index2);

    // Get funding level
    System.out.print("Enter min latitude to search: ");
    final double minLatitude = keyboard.nextDouble();
    System.out.println("Looking for min latitude " + minLatitude);
  
    // Runs the linear search on the array
    final Optional<Integer> index3 = Search.findStationMinLatitude(array, minLatitude);
    checkStationArrayIndex(array, index3);

    // Runs the binary search on the array
    final Optional<Integer> index4 = Search.findStationMinLatitudeFast(array, minLatitude);
    checkStationArrayIndex(array, index4);
  }
  
  static void checkStationArrayIndex(final Station[] array, final Optional<Integer> index) {
    // Checks the index
    if (index.isPresent()) {
      System.out.println("Found!");
      final int pos = index.get();
      final Station station = array[pos];
      // TODO DRY - eliminate this code duplication
      System.out.println("Name: " + station.getName());
      System.out.println("Lines: " + station.getLines());
      System.out.println("Lon/lat: " + station.getLon() + "," + station.getLat());
      System.out.println("Array index: " + pos);
    } else {
      System.out.println("Not Found!");
    }
  }

  static void checkStationListIndex(final List<Station> list, final Optional<Integer> index) {
    // Checks the index
    if (index.isPresent()) {
      System.out.println("Found!");
      final int pos = index.get();
      final Station station = list.get(pos);
      // TODO DRY - eliminate this code duplication
      System.out.println("Name: " + station.getName());
      System.out.println("Lines: " + station.getLines());
      System.out.println("Lon/lat: " + station.getLon() + "," + station.getLat());
      System.out.println("Array index: " + pos);
    } else {
      System.out.println("Not Found!");
    }
  }
}
