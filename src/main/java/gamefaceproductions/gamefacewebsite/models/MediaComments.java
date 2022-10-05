package gamefaceproductions.gamefacewebsite.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "media_comments")
public class MediaComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JsonIgnoreProperties({"gamerTag", "region", "blocked", "email", "createdAt", "role", "userFriends", "friendsList", "likes", "gameMedia"})
    private User author;

    @ManyToOne
    @JsonIgnoreProperties({"content", "gameMedia" })
    private GameMedia gameMedia;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private String content;
}
