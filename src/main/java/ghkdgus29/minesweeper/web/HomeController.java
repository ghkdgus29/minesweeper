package ghkdgus29.minesweeper.web;

import ghkdgus29.minesweeper.domain.Post;
import ghkdgus29.minesweeper.domain.dto.GameScore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GameScore gameScore;

    @GetMapping("/")
    public String home() {
        gameScore.initGame();
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

    @GetMapping("/new-post")
    public String post(Model model) {
        model.addAttribute("post", new Post(gameScore.getTotalMultipleScore()));
        return "new_post";
    }

    @PostMapping("/new-post")
    public String post(@ModelAttribute Post post) {

        System.out.println("post.getName() = " + post.getName());
        System.out.println("post.getScore() = " + post.getScore());
        System.out.println("post.getText() = " + post.getText());

        return "redirect:/";
    }

}
