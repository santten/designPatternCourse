package W6_flyweight;

import static W6_flyweight.TileType.SWAMP;

public class SwampTile extends Tile {
    @Override
    public TileType getType() {
        return SWAMP;
    }
}
