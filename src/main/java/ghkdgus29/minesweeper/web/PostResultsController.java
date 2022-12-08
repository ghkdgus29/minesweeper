package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import ghkdgus29.minesweeper.service.GameResultService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostResultsController {

    private final GameResultService gameResultService;

    @PostMapping("/post-result")
    public int getGameResult(@RequestBody GameResult gameResult) {
        int totalScore = gameResultService.calculateScore(gameResult);
        log.info("totalScore={}", totalScore);
        return totalScore;
    }

}
