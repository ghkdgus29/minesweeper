package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.dto.GameScore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GameScore gameScore;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/more-mine")
    public String moreMine(Model model) {
        model.addAttribute("gameCount", gameScore.getGameCount());
        model.addAttribute("totalScore", gameScore.getScore());
        return "more-mine";
    }

    @GetMapping("/rank")
    public String rank(Model model) {
        model.addAttribute("totalScore", gameScore.getScore());
        model.addAttribute("gameCount", gameScore.getGameCount());
        model.addAttribute("totalMultipleScore", gameScore.getTotalMultipleScore());
        return "rank";
    }
}
