package W6.flyweight;

import static W6.flyweight.TileType.BUILDING;

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
