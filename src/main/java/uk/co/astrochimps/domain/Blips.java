package uk.co.astrochimps.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Imran on 13-May-17.
 */
@Data
public class Blips {
    private List<Blip> blips = new ArrayList<>();

    public void addBlip(String name, String ring, String isNew, String topic, String description) {
        blips.add(new Blip(name, ring, isNew, topic, description));
    }
}