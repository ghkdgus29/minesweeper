package ghkdgus29.minesweeper.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Post {

    private String name;
    private final int score;
    private String text;

    public Post(int score) {
        this.score = score;
    }
}
