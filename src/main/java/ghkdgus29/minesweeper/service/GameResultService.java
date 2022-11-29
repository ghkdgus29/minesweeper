package ghkdgus29.minesweeper.service;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import ghkdgus29.minesweeper.domain.dto.GameScore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameResultService {

    private static final int MAX_TIME = 999;

    private final GameScore gameScore;

    public int calculateScore(GameResult gameResult) {

        String gameEndSign = gameResult.getGameMessage().split(" ")[1];
        if (gameEndSign.equals("OVER")) {
            gameScore.loseGame();
            return 0;
        }

        if (!gameResult.isGameContinue()) {
            int totalScore = gameScore.getScore();
            gameScore.endGame();
            return totalScore;
        }

        gameScore.addScore(MAX_TIME - gameResult.getGameTime());
        gameScore.addGameCount();
        return gameScore.getScore();
    }
}
