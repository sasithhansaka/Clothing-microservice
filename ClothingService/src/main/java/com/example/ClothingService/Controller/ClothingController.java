package com.example.ClothingService.Controller;


import com.example.ClothingService.Data.Clothe;
import com.example.ClothingService.Service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin ("*")
@RestController
public class ClothingController {

        @Autowired
        private ClothingService clothingService;

        @GetMapping(path = "/clothes")
        public List<Clothe> getAllClothes(){
            return  clothingService.getAllClothes();
        }

        @PostMapping("/Clothesave")
        public Clothe SaveClothe(@RequestBody Clothe clothingProduct){
            return clothingService.SaveClothe(clothingProduct);
        }


        @GetMapping("/max-id")
        public int getMaxid() {
            return clothingService.getMaxid();
        }

        @GetMapping("/sortedByPriceHighToLow")
        public List<Clothe> getAllClothesOrderedByPriceHighToLow() {
            return clothingService.getAllClothesOrderedByPriceHighToLow();
        }

        @GetMapping("/sortedByPriceLowToHigh")
        public List<Clothe> getAllClothesOrderedByPriceLowTooHigh() {
            return clothingService.getAllClothesOrderedByPriceLowTooHigh();
        }

        @GetMapping("/OutOfStock")
        public List<Clothe> getAllClothesOutOfStock() {
            return clothingService.getAllClothesOutOfStock();
        }

        @GetMapping("/last-four")
        public List<Clothe> getLastFourClothes() {
            return clothingService.getLastFourClothes();
        }

        @GetMapping("/LastestClothe")
        public List<Clothe> getLatestClothe() {
            return clothingService.getLatestClothe();
        }

}
