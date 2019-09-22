package com.dazn.temporary.home.organizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetLookingForHome {

  private Integer id;
  private String name;
  private Double age;
  private String sex;
//  private Boolean aggressiveToOtherSpecies;
//  private Boolean copingWithOppositeSex;
//  private Boolean okWithSmallChildren;
  //TODO: wonder whether primitive could be here as well- to be discussed

  PetLookingForHome(Integer id, String name, String sex, Double age) {
//                           boolean aggressiveToOtherSpecies,
//                           boolean copingWithOppositeSex,
//                           boolean okWithSmallChildren) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.age = age;
//    this.aggressiveToOtherSpecies = aggressiveToOtherSpecies;
//    this.copingWithOppositeSex = copingWithOppositeSex;
//    this. okWithSmallChildren = okWithSmallChildren;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return this.name;
  }

  public String getSex() {
    return sex;
  }

  public Double getAge() {
    return this.age;
  }

//  public Boolean aggressiveToOtherSpecies() {
//    return aggressiveToOtherSpecies;
//  }
//
//  public Boolean copingWithOppositeSex() {
//    return copingWithOppositeSex;
//  }
//
//  public Boolean okWithSmallChildren() {
//    return okWithSmallChildren;
//  }

  //4 first to be declared, 3 other to be verified

  @Override
  public boolean equals(Object o) {
    final PetLookingForHome e = (PetLookingForHome) o;
    return this.name.equals(e.name) &&
        this.age.equals(e.age) &&
        this.sex.equals(e.sex) &&
        this.id.equals(e.sex);
    //&&
//        this.aggressiveToOtherSpecies.equals(e.aggressiveToOtherSpecies) &&
//        this.copingWithOppositeSex.equals(e.copingWithOppositeSex) &&
//        this.okWithSmallChildren.equals(e.copingWithOppositeSex);
  }

  @Override
  public int hashCode() {
    if (id >= 0 && id < 4) {
      return 0;
    }
    if (id >= 5 && id < 9) {
      return 1;
    }
    return 3;
  }

  public String toString() {
    return id + ", " + name + ", " + sex + ", " + age + ", ";
//        aggressiveToOtherSpecies + ", "+ copingWithOppositeSex + ", "+
//        okWithSmallChildren;
  }

}

class PetLookingForHomeData {

  public static void main(String[] args) throws java.lang.Exception {

    PetLookingForHome pet1 = new PetLookingForHome(1, "Arnold", "M", 4.5);
    PetLookingForHome pet2 = new PetLookingForHome(2, "Anorexia", "F", 3.5);
    PetLookingForHome pet3 = new PetLookingForHome(3, "Aronia", "F", 1.5);
    PetLookingForHome pet4 = new PetLookingForHome(4, "Awokado", "M", 0.5);
    PetLookingForHome pet5 = new PetLookingForHome(5, "Ananas", "M", 4.0);
    PetLookingForHome pet6 = new PetLookingForHome(6, "Anarchia", "F", 11.5);
    PetLookingForHome pet7 = new PetLookingForHome(7, "Anty", "M", 2.5);
    PetLookingForHome pet8 = new PetLookingForHome(8, "Ant", "F", 0.5);
    PetLookingForHome pet9 = new PetLookingForHome(9, "Anchor", "M", 13.0);
    PetLookingForHome pet10 = new PetLookingForHome(10, "Antilope", "F", 1.5);

    Map<PetLookingForHome, List<Boolean>> petVerification = new HashMap<PetLookingForHome, List<Boolean>>();
//TODO: wonder how to make it clear all 3 aspects are taken into consideration, in order: aggresive to other specie,
// coping with opposite sex, ok with small children

    List<Boolean> petVerifier1 = new ArrayList<Boolean>();
    petVerifier1.add(true);

    List<Boolean> petVerifier2 = new ArrayList<Boolean>();
    petVerifier2.add(false);

    List<Boolean> petVerifier3 = new ArrayList<Boolean>();
    petVerifier3.add(true);

    List<Boolean> petVerifier4 = new ArrayList<Boolean>();
    petVerifier4.add(true);

    List<Boolean> petVerifier5 = new ArrayList<Boolean>();
    petVerifier5.add(true);

    List<Boolean> petVerifier6 = new ArrayList<Boolean>();
    petVerifier6.add(true);

    List<Boolean> petVerifier7 = new ArrayList<Boolean>();
    petVerifier7.add(true);

    List<Boolean> petVerifier8 = new ArrayList<Boolean>();
    petVerifier8.add(true);

    List<Boolean> petVerifier9 = new ArrayList<Boolean>();
    petVerifier9.add(true);

    List<Boolean> petVerifier10 = new ArrayList<Boolean>();
    petVerifier10.add(true);

    petVerification.put(pet1, petVerifier1);
    petVerification.put(pet2, petVerifier2);
    petVerification.put(pet3, petVerifier3);
    petVerification.put(pet4, petVerifier4);
    petVerification.put(pet5, petVerifier5);
    petVerification.put(pet6, petVerifier6);
    petVerification.put(pet7, petVerifier7);
    petVerification.put(pet8, petVerifier8);
    petVerification.put(pet9, petVerifier9);
    petVerification.put(pet10, petVerifier10);

    for (Map.Entry < PetLookingForHome, List < Boolean >> entry: petVerification.entrySet()) {

      System.out.println("The pet's ID, name, sex and age: " + entry.getKey().toString() + "," +  " Is the pet aggressive to other species: " + entry.getValue());
    }
  }

}


