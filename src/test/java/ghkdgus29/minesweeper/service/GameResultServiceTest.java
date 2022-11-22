package ghkdgus29.minesweeper.service;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameResultServiceTest {

    @Test
    void calculateScore() {
        GameResult gameResult = new GameResult("GAME WIN", 99);
        GameResultService gameResultService = new GameResultService();

        int score = gameResultService.calculateScore(gameResult);

        assertThat(score).isEqualTo(900);
    }
}