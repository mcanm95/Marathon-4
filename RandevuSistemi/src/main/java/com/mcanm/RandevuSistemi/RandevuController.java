package com.mcanm.RandevuSistemi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/randevu")
public class RandevuController {

    private final RandevuService randevuService;

    @Autowired
    public RandevuController(RandevuService randevuService) {
        this.randevuService = randevuService;
    }

    @PostMapping("/create")
    public ResponseEntity<RandevuDto> createRandevu(@RequestBody RandevuDto randevuDto) {
        RandevuDto createdRandevu = randevuService.createRandevu(randevuDto);
        return new ResponseEntity<>(createdRandevu, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<RandevuDto>> getRandevuListesi() {
        List<RandevuDto> randevuListesi = randevuService.getRandevuListesi();
        return new ResponseEntity<>(randevuListesi, HttpStatus.OK);
    }

    @GetMapping("/empty-saatler")
    public ResponseEntity<List<LocalTime>> getBosRandevuSaatleri() {
        List<LocalTime> bosSaatler = randevuService.getBosRandevuSaatleri();
        return new ResponseEntity<>(bosSaatler, HttpStatus.OK);
    }

    @DeleteMapping("/cancel/{randevuId}")
    public ResponseEntity<String> cancelRandevu(@PathVariable Long randevuId) {
        randevuService.cancelRandevu(randevuId);
        return new ResponseEntity<>("Randevu başarıyla iptal edildi.", HttpStatus.OK);
    }
}

