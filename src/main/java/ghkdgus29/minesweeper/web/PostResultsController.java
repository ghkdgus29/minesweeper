package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostResultsController {

    @PostMapping("/post-result")
    public GameResult getGameResult(@RequestBody GameResult gameResult) {

        System.out.println(gameResult);

        System.out.println(gameResult.getGameMessage());
        System.out.println(gameResult.getGameTime());

        return gameResult;
    }
}
