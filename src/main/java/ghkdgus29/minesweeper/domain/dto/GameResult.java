package ghkdgus29.minesweeper.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameResult {

    private String gameMessage;
    private Integer gameTime;

    public GameResult(String gameMessage, Integer gameTime) {
        this.gameMessage = gameMessage;
        this.gameTime = gameTime;
    }
}
