package ghkdgus29.minesweeper.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

@Slf4j
@Getter
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GameScore {

    private Integer score;
    private Integer gameCount;

    public GameScore() {
        this.score = 0;
        this.gameCount = 1;
        log.info(UUID.randomUUID().toString());
    }

    public void addScore(Integer score) {
        this.score += score;
        log.info("더하는점수={}, 최종점수={}", score, this.score);
    }

    public void addGameCount() {
        gameCount += 1;
        log.info("현재게임시도횟수={}", this.gameCount);
    }

    public void initGame() {
        score = 0;
        gameCount = 1;
    }

    public int getTotalMultipleScore() {
        return score * gameCount;
    }
}
