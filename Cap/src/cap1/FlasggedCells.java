package Cap.src.cap1;

import java.util.ArrayList;
import java.util.List;

public class FlasggedCells {

    private static final Cell[] gameBoard = null;

    public List<Cell> getFlaggedCells() {

        List<Cell> flaggedCells = new ArrayList<Cell>();
        
        for (Cell cell : gameBoard)
           
            if (cell.isFlagged())
                flaggedCells.add(cell);
        
                return flaggedCells;
    
    }
}
