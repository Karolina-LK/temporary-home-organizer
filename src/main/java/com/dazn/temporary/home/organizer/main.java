package com.dazn.temporary.home.organizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {


  //metpdy laczace PLH z wymaganiami Temporary Homes (boolean full;
  //  int noOfDeclaredVacancies;
  //  boolean goodOpinion;
  //  boolean garden;
  //  String address;
  //  String id;
  //  boolean smokingOwner;
  //  int greenAreaDistance;
  //  boolean netWindows;
  //  boolean awareOfPetCosts;
  //  boolean followingAgreements;
  //  String acceptSpecies;)

  private String statement = "There is no such Pet in here :(";

  PetLookingForHome pet1 = new PetLookingForHome(1, "Arnold", "M", 4.5,
      true, false, true);
  PetLookingForHome pet2 = new PetLookingForHome(2, "Anorexia", "F", 3.5,
      true, false, true);
  PetLookingForHome pet3 = new PetLookingForHome(3, "Aronia", "F", 1.5,
      true, false, true);
  PetLookingForHome pet4 = new PetLookingForHome(4, "Awokado", "M", 0.5,
      true, false, true);
  PetLookingForHome pet5 = new PetLookingForHome(5, "Ananas", "M", 4.0,
      true, false, true);
  PetLookingForHome pet6 = new PetLookingForHome(6, "Anarchia", "F", 11.5,
      true, false, true);
  PetLookingForHome pet7 = new PetLookingForHome(7, "Anty", "M", 2.5,
      true, false, true);
  PetLookingForHome pet8 = new PetLookingForHome(8, "Ant", "F", 0.5,
      true, false, true);
  PetLookingForHome pet9 = new PetLookingForHome(9, "Anchor", "M", 13.0,
      true, false, true);
  PetLookingForHome pet10 = new PetLookingForHome(10, "Antilope", "F", 1.5,
      true, false, true);

  List<PetLookingForHome> pets = new ArrayList<>(Arrays.asList(pet1, pet2, pet3, pet4, pet5, pet6));

//  for (PetLookingForHome pet : pets) {
//
//    System.out.println("The pet's ID: " + pet.getId() + "; \n" + "Its name: " + pet.getName() + "; \n"
//        + "Its sex and age: " + pet.getSex() + ", " + pet.getAge() +
//        "; \n" + "Is the pet aggressive to other species: "
//        + pet.getOkWithOtherSpecies() + "; \n" + "Is the pet coping with the opposite sex: "
//        + pet.getOkWithOppositeSex() + "; \n" + "Can the pet cooperate with small children: " +
//        pet.getOkWithSmallChildren() + ".");
//  }


  public int findPetViaID(int id) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return -1;
  }

  public String findPetViaName(String name) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return statement;
  }

  public double findPetViaAge(double age) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return -1.0;
  }

  public String findPetViaSex(String sex) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return statement;
  }

  public boolean findPetViaOkWithOtherSpecies(boolean okWithOtherSpecies) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return false;
  }

  public boolean findPetViaokWithOppositeSex(boolean okWithOppositeSexs) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return false;
  }

  public boolean findPetViaokWithSmallChildren(boolean okWithSmallChildrens) {
//    assuming the PLH are gathered in the  List<PetLookingForHome> pets,
//    i should have pets.contains or pets.get combined with for or forEach loop
    return false;
  }

}
