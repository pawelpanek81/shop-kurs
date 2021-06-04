package pl.asoft.shop.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.asoft.shop.model.WineDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class WinesController {
    List<String> wines = new ArrayList<>();

    public WinesController() {
        wines.add("Amarena");
        wines.add("Pożeczkowe");
    }

    @GetMapping("/wines")
    public ResponseEntity<List<String>> getWines() {
        return ResponseEntity.ok(wines);
    }

    @PostMapping("/wines")
    public ResponseEntity<?> addWine(@RequestBody WineDto wineDto) {
        wines.add(wineDto.name);
        return ResponseEntity.accepted().build();
    }

}
