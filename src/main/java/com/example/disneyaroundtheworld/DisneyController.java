
package com.example.disneyaroundtheworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DisneyController {

    private final List<DisneyPark> parks = new ArrayList<>();

    public DisneyController() {
        parks.add(new DisneyPark(
                "Disneyland",
                "Anaheim, California",
                "Disneyland Resort"
        ));

        parks.add(new DisneyPark(
                "Magic Kingdom",
                "Orlando, Florida",
                "Walt Disney World Resort"
        ));

        parks.add(new DisneyPark(
                "Tokyo Disneyland",
                "Tokyo, Japan",
                "Tokyo Disney Resort"
        ));

        parks.add(new DisneyPark(
                "Disneyland Park",
                "Marne-la-Vallée, France",
                "Disneyland Paris"
        ));

        parks.add(new DisneyPark(
                "Hong Kong Disneyland",
                "Hong Kong",
                "Hong Kong Disneyland Resort"
        ));

        parks.add(new DisneyPark(
                "Shanghai Disneyland",
                "Shanghai, China",
                "Shanghai Disney Resort"
        ));
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("parks", parks);
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String query, Model model) {

        List<DisneyPark> results = searchParks(query);

        model.addAttribute("parks", results);
        model.addAttribute("query", query);

        return "index";
    }

    public List<DisneyPark> searchParks(String query) {

        List<DisneyPark> results = new ArrayList<>();

        for (DisneyPark park : parks) {
            if (park.getName().toLowerCase().contains(
                    query.toLowerCase())
                    || park.getLocation().toLowerCase()
                    .contains(query.toLowerCase())) {
                results.add(park);
            }
        }

        return results;
    }
}
