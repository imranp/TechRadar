package uk.co.astrochimps.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Imran on 13-May-17.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Blip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String ring;
    private String isNew;
    private String quadrant;
    private String description;

    public Blip(String name, String ring, String isNew, String quadrant, String description) {
        this.name = name;
        this.ring = ring;
        this.isNew = isNew;
        this.quadrant = quadrant;
        this.description = description;
    }

}