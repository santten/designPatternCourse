package W6.flyweight;

import static W6.flyweight.TileType.WATER;

public class WaterTile extends Tile {
    @Override
    public TileType getType() {
        return WATER;
    }
}
