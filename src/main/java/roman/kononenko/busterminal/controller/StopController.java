package roman.kononenko.busterminal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roman.kononenko.busterminal.dto.request.StopRequest;
import roman.kononenko.busterminal.dto.response.StopResponse;
import roman.kononenko.busterminal.repository.StopRepository;
import roman.kononenko.busterminal.service.StopService;

import java.util.List;

@RestController
@RequestMapping("/stop")
public class StopController {
    @Autowired
    private StopService stopService;

    @PostMapping
    public List<StopResponse> findAll(){
        return stopService.findAll();
    }
}
