package com.mcanm.RandevuSistemi;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RandevuMapper {

    public RandevuDto toDto(Randevu randevu) {
        RandevuDto randevuDto = new RandevuDto();
        randevuDto.setId(randevu.getId());
        randevuDto.setIsim(randevu.getIsim());
        randevuDto.setTelefon(randevu.getTelefon());
        randevuDto.setTarih(randevu.getTarih());
        randevuDto.setSaat(randevu.getSaat());
        return randevuDto;
    }

    public Randevu toEntity(RandevuDto randevuDto) {
        Randevu randevu = new Randevu();
        randevu.setId(randevuDto.getId());
        randevu.setIsim(randevuDto.getIsim());
        randevu.setTelefon(randevuDto.getTelefon());
        randevu.setTarih(randevuDto.getTarih());
        randevu.setSaat(randevuDto.getSaat());
        return randevu;
    }

    public List<RandevuDto> toDtoList(List<Randevu> randevular) {
        return null;
    }
}

