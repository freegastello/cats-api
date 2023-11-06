package com.example.catsapi.service;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

//    @Autowired
//    public CatService(CatRepository catRepository) {
//        this.catRepository = catRepository;
//    }

    public Cat save(CatDto catDto) {
        Cat cat = new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catDto.getName())
                .setBirthDay(LocalDate.now())
                .setCreatedAt(LocalDateTime.now());

        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
