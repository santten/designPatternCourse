package W6_flyweight;

import static W6_flyweight.TileType.WATER;

public class WaterTile extends Tile {
    @Override
    public TileType getType() {
        return WATER;
    }
}
