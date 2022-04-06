import java.util.*;

public class CollectionsLecture {

    public static void main(String[] args) {
//    ArrayList<Monster> monsterList = new ArrayList<>();
//
//    Monster orc = new Monster("Orc", 13, 15, 9);
//
//    monsterList.add(orc);
//        System.out.println(monsterList.size());
//
//        Monster ogre = new Monster("Ogre", 11, 59, 13);
//
//        monsterList.add(ogre);
//        System.out.println(monsterList.size());
//
//        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
//
//        monsterList.add(blueDragon);
//        System.out.println(monsterList.size());
//        System.out.println(monsterList);
//
////        monsterList.remove(blueDragon);
////        System.out.println(monsterList.size());
////        monsterList.remove(1);
////        System.out.println(monsterList.size());
//
////        for (int i = 0; i < monsterList.size(); i++){
////            String name = monsterList.get(i).getName();
////            int damage = monsterList.get(i).getDamage();
////            int hitPoints = monsterList.get(i).getHitPoints();
////            System.out.printf("The %s does %d damage and has %d hit points%n", name, damage, hitPoints);
////        }
//
//        for (Monster monster : monsterList){
//            System.out.println("The " + monster.getName() + " has " + monster.getHitPoints() + " hit points and does " + monster.getDamage() + " points of damage when it attacks.");
//        }
//
//        ArrayList<Integer> myNumbers = new ArrayList<>();
//        myNumbers.add(42);
//        myNumbers.add(56);
//        myNumbers.add(43);
//        System.out.println(myNumbers.get(1));
//        System.out.println(myNumbers);
//       Collections.sort(myNumbers); //how to sort a list
//        System.out.println(myNumbers);

 //mini-exercise
////Create 3 Person objects. Create an ArrayList that holds persons. Add the persons to the ArrayList. Iterate over the ArrayList either with a for loop or an enhanced for loop, printing out to the console each person's name.
//
////        ArrayList<Person> personList = new ArrayList<>();
////        Person Lorne = new Person("Lorne");
////        personList.add(Lorne);
////        Person Kaylah = new Person("Kaylah");
////        personList.add(Kaylah);
////        Person Alfredo = new Person("Alfredo");
////        personList.add(Alfredo);
////
////        for(Person person : personList){
////            System.out.println(person.getName());
////
////        }

        //Hashmaps
        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Gregg Popovich", 1341);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkins", 1332);

        System.out.println(careerWins.get("Gregg Popovich")); //1341
        System.out.println(careerWins); //{Lenny Wilkins=1332, Gregg Popovich=1341, Don Nelson=1335} order is not particular

        careerWins.replace("Gregg Popovich", 1342); //added an extra win
        System.out.println(careerWins);
        System.out.println(careerWins.get("Lenny Wilkins"));//grab a particular object

        //unable to use for loops due to no index in hashmaps
        for (Map.Entry<String, Integer> careerWinsEntry :
        careerWins.entrySet()){
            System.out.println(careerWinsEntry.getKey() + " : " + careerWinsEntry.getValue());
        }
        Set<String> coachNames = careerWins.keySet();
        for (String coachName : coachNames){
            System.out.println(coachName);
        }

    }
}
