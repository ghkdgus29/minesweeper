package ghkdgus29.minesweeper.service;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import org.springframework.stereotype.Service;

@Service
public class GameResultService {

    private static final int MAX_TIME = 999;

    public int calculateScore(GameResult gameResult) {
        String gameEndSign = gameResult.getGameMessage().split(" ")[1];
        if (gameEndSign.equals("OVER")) {
            return 0;
        }
        return MAX_TIME - gameResult.getGameTime();
    }
}
