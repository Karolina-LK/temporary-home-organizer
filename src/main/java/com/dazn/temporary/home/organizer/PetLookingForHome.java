package com.dazn.temporary.home.organizer;

public class PetLookingForHome {

  private int id;
  private String name;
  private double age;
  private String sex;
  private boolean okWithOtherSpecies;
  private boolean okWithOppositeSex;
  private boolean okWithSmallChildren;

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

}

