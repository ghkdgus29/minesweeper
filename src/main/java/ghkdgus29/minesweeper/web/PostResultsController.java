package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import ghkdgus29.minesweeper.service.GameResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostResultsController {

    private final GameResultService gameResultService;

    @PostMapping("/post-result")
    public int getGameResult(@RequestBody GameResult gameResult, Model model) {

        return gameResultService.calculateScore(gameResult);
    }
}
