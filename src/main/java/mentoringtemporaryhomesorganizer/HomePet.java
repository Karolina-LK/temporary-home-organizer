package mentoringtemporaryhomesorganizer;

public class HomePet  implements Pet, Home {
 //jeszcze nie mam pewnosci, ale HP jest skorelowany z Pet, i powinien z domem
    String name;
    double age;
    char sex;
    String id;
    boolean aggressiveToOtherSpecies; //zastanaiwam sie, jak polaczyc ze agresywne i ze do kogo
    boolean copingWithOppositeSex;
    boolean okWithSmallChildren;
}
