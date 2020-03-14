package miraclesgroup.demo.service.impl;

import miraclesgroup.demo.entity.Miracles;
import miraclesgroup.demo.repository.MiraclesRepository;
import miraclesgroup.demo.service.MiraclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiraclesServiceImpl implements MiraclesService {
    @Autowired
    MiraclesRepository miraclesRepository;

    @Override
    public List<Miracles> findAll() {
        return miraclesRepository.findAll();
    }
}
