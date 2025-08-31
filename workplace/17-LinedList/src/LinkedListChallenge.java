import java.util.LinkedList;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place aldelaide = new Place("adelaide", 800) ;
        addPlace(placesToVisit, aldelaide);
        addPlace(placesToVisit, new Place("Adelaide", 1437)); // will return duplicate 
        addPlace(placesToVisit, new Place("adelaide", 1437));
        addPlace(placesToVisit, new Place("hebron", 2000));
        addPlace(placesToVisit, new Place("jerico", 1500));
        addPlace(placesToVisit, new Place("darwin", 3000));
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if(list.contains(place)) {
            System.out.println("Found duplicate : " + place);
            return;
        }

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace: list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place) ;
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}