package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import ghkdgus29.minesweeper.service.GameResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostResultsController {

    private final GameResultService gameResultService;

    @PostMapping("/post-result")
    public String getGameResult(@RequestBody GameResult gameResult) {

        System.out.println(gameResultService.calculateScore(gameResult));
        return "ok";
    }
}
