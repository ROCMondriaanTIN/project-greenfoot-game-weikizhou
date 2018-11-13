
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
            case 11:
                tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
            case 12:
                tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
            case 13:
                tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
            case 15:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
 	   case 16:
                tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);	
		tile.isSolid = true;
                break;
 	   case 17:
                tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;	
	   case 18:
                tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;	
	   case 19:
                tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	  case 20:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
 	  case 21:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 22:
                tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);	
		tile.isSolid = true;
                break;
        case 24:
                tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
         case 26:
                tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 27:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 28:
                tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 29:
                tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 30:
                tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 31:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 32:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 33:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 34:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 35:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 36:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 37:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 42:
                tile = new Tile("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 43:
                tile = new Tile("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 44:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 46:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 47:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 49:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 56:
                tile = new Tile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
		tile.isSolid = true;
                break;
	 case 57:
                tile = new Tile("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 58:
                tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 59:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
	 case 60:
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;

	



            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
