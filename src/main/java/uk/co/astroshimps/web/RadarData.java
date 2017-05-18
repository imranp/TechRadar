package uk.co.astroshimps.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.astroshimps.domain.Blip;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RadarData {

    @GetMapping("/blips/all")
    public ResponseEntity<List<Blip>> getAllBlips() {
        List<Blip> blips = new ArrayList<>();
        blips.add(new Blip("Babel", "adopt", "FALSE","tools", "Desc1"));
        blips.add(new Blip("Vue.js", "assess", "FALSE","languages & frameworks", "Little Deployables"));
        blips.add(new Blip("Kubernetes", "trial", "FALSE","platforms", "Awesome int int"));
        blips.add(new Blip("Big Data", "hold", "FALSE","techniques", "Awesome int int"));
        return ResponseEntity.ok(blips);
    }
}
