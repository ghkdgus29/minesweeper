package ghkdgus29.minesweeper.service;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import ghkdgus29.minesweeper.domain.dto.GameScore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameResultServiceTest {

    @Test
    void calculateScore() {
        GameResult gameResult = new GameResult("GAME WIN", true, 99, 2);
        GameScore gameScore = new GameScore();
        GameResultService gameResultService = new GameResultService(gameScore);

        int score = gameResultService.calculateScore(gameResult);

        assertThat(score).isEqualTo(900);
    }
}