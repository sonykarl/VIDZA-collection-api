package com.example.vidza.features.store.inventory.service;

import com.example.vidza.entities.Shoe;
import com.example.vidza.repositories.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private ShoeRepository shoeRepository;

    @Override
    public Shoe addShoeDetails(Shoe shoe) {
        return shoeRepository.save(shoe);
    }

    @Override
    public Shoe addShoePhotos(Shoe shoe) {
        return shoeRepository.save(shoe);
    }


}
