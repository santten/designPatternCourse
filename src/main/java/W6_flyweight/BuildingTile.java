package W6_flyweight;

import static W6_flyweight.TileType.BUILDING;

public class BuildingTile extends Tile {
    @Override
    public TileType getType() {
        return BUILDING;
    }

    @Override
    public void action(){
        System.out.println("Welcome to the building!");
    }
}
