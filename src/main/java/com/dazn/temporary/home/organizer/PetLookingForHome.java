package com.dazn.temporary.home.organizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PetLookingForHome {

  private Integer id;
  private String name;
  private Double age;
  private String sex;
  private Boolean okWithOtherSpecies;
  private Boolean okWithOppositeSex;
  private Boolean okWithSmallChildren;

  PetLookingForHome(Integer id, String name, String sex, Double age, boolean okWithOtherSpecies,
                    boolean okWithOppositeSex,
                    boolean okWithSmallChildren
  ) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.okWithOtherSpecies = okWithOtherSpecies;
    this.okWithOppositeSex = okWithOppositeSex;
    this.okWithSmallChildren = okWithSmallChildren;
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

  public Boolean getOkWithOtherSpecies() {
    return okWithOtherSpecies;
  }

  public Boolean getOkWithOppositeSex() {
    return okWithOppositeSex;
  }

  public Boolean getOkWithSmallChildren() {
    return okWithSmallChildren;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetLookingForHome that = (PetLookingForHome) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(age, that.age) &&
        Objects.equals(sex, that.sex) &&
        Objects.equals(okWithOtherSpecies, that.okWithOtherSpecies) &&
        Objects.equals(okWithOppositeSex, that.okWithOppositeSex) &&
        Objects.equals(okWithSmallChildren, that.okWithSmallChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, sex, okWithOtherSpecies, okWithOppositeSex, okWithSmallChildren);
  }

  public String toString() {
    return id + ", " + name + ", " + sex + ", " + age + ", " +
        okWithOtherSpecies + ", " + okWithOppositeSex + ", " +
        okWithSmallChildren;
  }

}

class PetLookingForHomeData {

  public static void main(String[] args) throws Exception {

    // List<PetLookingForHome> pets  = new ArrayList<>();

    PetLookingForHome pet1 = new PetLookingForHome(1, "Arnold", "M", 4.5,
        true, false, true);
    PetLookingForHome pet2 = new PetLookingForHome(2, "Anorexia", "F", 3.5,
        true, false, true);
//    PetLookingForHome pet3 = new PetLookingForHome(3, "Aronia", "F", 1.5);
//    PetLookingForHome pet4 = new PetLookingForHome(4, "Awokado", "M", 0.5);
//    PetLookingForHome pet5 = new PetLookingForHome(5, "Ananas", "M", 4.0);
//    PetLookingForHome pet6 = new PetLookingForHome(6, "Anarchia", "F", 11.5);
//    PetLookingForHome pet7 = new PetLookingForHome(7, "Anty", "M", 2.5);
//    PetLookingForHome pet8 = new PetLookingForHome(8, "Ant", "F", 0.5);
//    PetLookingForHome pet9 = new PetLookingForHome(9, "Anchor", "M", 13.0);
//    PetLookingForHome pet10 = new PetLookingForHome(10, "Antilope", "F", 1.5);

    List<PetLookingForHome> pets = new ArrayList<>(Arrays.asList(pet1, pet2));

//    pets.add(pet1);
//    pets.add(pet2);

    for (PetLookingForHome pet : pets) {

      System.out.println("The pet's ID: " + pet.getId() + "; \n" + "Its name: " + pet.getName() + "; \n"
          + "Its sex and age: " + pet.getSex() + ", " + pet.getAge() +
          "; \n" + "Is the pet aggressive to other species: "
          + pet.getOkWithOtherSpecies() + "; \n" + "Is the pet coping with the opposite sex: "
          + pet.getOkWithOppositeSex() + "; \n" + "Can the pet cooperate with small children: " +
          pet.getOkWithSmallChildren() + ".");
    }
  }

}


