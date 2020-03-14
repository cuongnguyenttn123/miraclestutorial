package miraclesgroup.demo.controller;

import miraclesgroup.demo.entity.Miracles;
import miraclesgroup.demo.service.MiraclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/miracles")
public class MiraclesController {
    @Autowired
    MiraclesService miraclesService;

    @GetMapping
    public List<Miracles> findAll(){
        return miraclesService.findAll();
    }
}
