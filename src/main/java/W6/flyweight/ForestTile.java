package W6.flyweight;

import static W6.flyweight.TileType.FOREST;

public class ForestTile extends Tile {
    @Override
    public TileType getType() {
        return FOREST;
    }
}
