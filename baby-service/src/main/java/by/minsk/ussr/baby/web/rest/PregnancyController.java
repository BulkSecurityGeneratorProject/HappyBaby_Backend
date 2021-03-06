package by.minsk.ussr.baby.web.rest;

import by.minsk.ussr.baby.model.Pregnancy;
import by.minsk.ussr.baby.service.PregnancyService;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pregnancy")
public class PregnancyController {

    private final PregnancyService pregnancyService;

    public PregnancyController(PregnancyService pregnancyService) {
        this.pregnancyService = pregnancyService;
    }

    @GetMapping
    public Pregnancy activePregnancy() {
        return pregnancyService.findActive();
    }

    @GetMapping("/all")
    public Collection<Pregnancy> allPregnancies() {
        return pregnancyService.findAll();
    }
}
