package com.example.springbootreadyaml.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface FileService {

    Object file(MultipartFile file) throws IOException;
}
