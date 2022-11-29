package ghkdgus29.minesweeper.domain.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GameResult {

    private final String gameMessage;
    private final boolean gameContinue;
    private final Integer gameTime;
    private final Integer gameCount;

    public GameResult(String gameMessage, boolean gameContinue, Integer gameTime, Integer gameCount) {
        this.gameMessage = gameMessage;
        this.gameContinue = gameContinue;
        this.gameTime = gameTime;
        this.gameCount = gameCount;
    }
}
