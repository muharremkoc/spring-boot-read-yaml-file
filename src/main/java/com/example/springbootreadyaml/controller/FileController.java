package com.example.springbootreadyaml.controller;

import com.example.springbootreadyaml.service.FileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/converter")
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class FileController {

    final FileService fileService;

    @PostMapping(value = "/yaml",consumes = {"multipart/form-data"})
    public Object convert(@RequestPart MultipartFile file) throws IOException {
        return fileService.file(file);
    }
}
