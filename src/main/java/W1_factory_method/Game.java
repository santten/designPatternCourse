package W1_factory_method;

public class Game {
    public static void main(String[] args) {
        WildernessMap wildernessMap = new WildernessMap();
        CityMap cityMap = new CityMap();

        createMap(cityMap);
    }

    public static void createMap(Map map){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                Tile tile = map.createTile();
                System.out.printf(tile.getCharacter());
            }
            System.out.println();
        }
        map.display();
    }
}