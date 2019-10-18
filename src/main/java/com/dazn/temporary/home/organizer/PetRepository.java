package com.dazn.temporary.home.organizer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class PetRepository {

  //lazy instantiating - to add set-as-null class reference
  private static PetRepository petRepositoryInstance = null;

  //setting constructor to private in order to prevent illegal creating the class object
  private PetRepository() {

  }

  //Singleton class of getInstance
  public static PetRepository getInstance() {

    if (petRepositoryInstance == null) {
      petRepositoryInstance = new PetRepository();
    }
    return petRepositoryInstance;
  }

  //other version found to prevent multi-thread issue problems
//  public static PetRepository getInstance() {
//
//    if (petRepositoryInstance == null) {
//      synchronized (PetRepository.class) {
//        if (petRepositoryInstance == null) {
//          petRepositoryInstance = new PetRepository();
//        }
//      }
//    }
//    return petRepositoryInstance;
//  }

  private static List<PetLookingForHome> pets = Arrays.asList(
      new PetLookingForHome(1, "Arnold", "M", 4.5, true, false, true),
      new PetLookingForHome(2, "Anorexia", "F", 3.5, true, false, true),
      new PetLookingForHome(3, "Aronia", "F", 1.5, true, false, true),
      new PetLookingForHome(4, "Awokado", "M", 0.5, true, false, true),
      new PetLookingForHome(5, "Ananas", "M", 4.0, true, false, true),
      new PetLookingForHome(6, "Anarchia", "F", 11.5, true, false, true),
      new PetLookingForHome(7, "Anty", "M", 2.5, true, false, true),
      new PetLookingForHome(8, "Ant", "F", 0.5, true, false, true),
      new PetLookingForHome(9, "Anchor", "M", 13.0, true, false, true),
      new PetLookingForHome(10, "Antilope", "F", 1.5, true, false, true)
  );

  public Optional<PetLookingForHome> get(Integer id) {
    return Optional.empty();
  }

  public void create(PetLookingForHome pet) {

  }

  public List<PetLookingForHome> getAll() {
    return pets;
  }
}
