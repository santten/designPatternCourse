package W6.flyweight;

import static W6.flyweight.TileType.ROAD;

public class RoadTile extends Tile {
    @Override
    public TileType getType() {
        return ROAD;
    }

    @Override
    public void action(){
        System.out.println("You are on the road");
    }
}