package roman.kononenko.busterminal.service;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roman.kononenko.busterminal.dto.request.StopRequest;
import roman.kononenko.busterminal.dto.response.StopResponse;
import roman.kononenko.busterminal.entity.Stop;
import roman.kononenko.busterminal.repository.StopRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StopService {
    @Autowired
    private StopRepository stopRepository;

    public void create(StopRequest stopRequest) {
        Stop stop = new Stop();
        stop.setPlaceName(stopRequest.getPlaceName());
        stopRepository.save(stop);
    }

    public List<StopResponse> findAll() {
        return stopRepository.findAll().stream().
                map(StopResponse::new).collect(Collectors.toList());
    }
}
