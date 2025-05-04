package W6.flyweight;

import static W6.flyweight.TileType.SWAMP;

public class SwampTile extends Tile {
    @Override
    public TileType getType() {
        return SWAMP;
    }
}
