package W6_flyweight;

import static W6_flyweight.TileType.FOREST;

public class ForestTile extends Tile {
    @Override
    public TileType getType() {
        return FOREST;
    }
}
