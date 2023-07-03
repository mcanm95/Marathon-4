package com.mcanm.RandevuSistemi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class RandevuService {

    private final RandevuRepository randevuRepository;
    private final RandevuMapper randevuMapper;
    private List<LocalTime> bosSaatler;

    @Autowired
    public RandevuService(RandevuRepository randevuRepository, RandevuMapper randevuMapper) {
        this.randevuRepository = randevuRepository;
        this.randevuMapper = randevuMapper;
    }

    public RandevuDto createRandevu(RandevuDto randevuDto) {
        Randevu randevu = randevuMapper.toEntity(randevuDto);
        Randevu savedRandevu = randevuRepository.save(randevu);
        return randevuMapper.toDto(savedRandevu);
    }

    public List<RandevuDto> getRandevuListesi() {
        List<Randevu> randevular = randevuRepository.findAll();
        return randevuMapper.toDtoList(randevular);
    }

    public List<LocalTime> getBosRandevuSaatleri() {

        return bosSaatler;
    }

    public void cancelRandevu(Long randevuId) {
        randevuRepository.deleteById(randevuId);
    }
}

