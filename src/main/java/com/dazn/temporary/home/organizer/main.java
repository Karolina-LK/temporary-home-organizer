package com.dazn.temporary.home.organizer;

import java.util.Optional;

public class Main {

  private final PetRepository repository = new PetRepository();

  private static final String STATEMENT = "There is no such Pet in here :(";


  public static void main(String[] args) {
    new Main().run(args);
  }

  private void run(String[] args) {

    for (String arg : args) {
      if (arg.equals("find")) {
        repository.get(156);
      }
    }
  }

  public Optional<Integer> findPetViaID(Integer id) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    System.out.println(STATEMENT);
    return Optional.empty();
  }

  public String findPetViaName(String name) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return STATEMENT;
  }

  public double findPetViaAge(double age) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return -1.0;
  }

  public String findPetViaSex(String sex) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return STATEMENT;
  }

}
