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
@Table(name = "media_comment")
public class MediaComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JsonIgnoreProperties({"gameMedia"})
    private User author;

    @ManyToOne
    @JsonIgnoreProperties({"gameMedia"})
    private GameMedia gameMedia;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private String content;
}
