package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameScore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GameScore gameScore;

    @GetMapping("/")
    public String home() {
        log.info("gameScore={}", gameScore.getScore());
        log.info("gameCount={}", gameScore.getGameCount());
        return "index";
    }

    @GetMapping("/more-mine")
    public String moreMine(Model model) {
        model.addAttribute("gameCount", gameScore.getGameCount());
        log.info("gameScore={}", gameScore.getScore());
        log.info("gameCount={}", gameScore.getGameCount());
        return "more-mine";
    }
}
