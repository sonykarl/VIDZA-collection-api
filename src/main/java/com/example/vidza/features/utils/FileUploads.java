package com.example.vidza.features.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileUploads {

    public String uploadFile(MultipartFile file, String filePath){
        try{
            byte[] fileByte = file.getBytes();
            String fileName = file.getOriginalFilename();
            Path path = Paths.get(filePath + fileName);
            Files.write(path, fileByte);
            return "file uploaded";
        }catch (IOException e){
            return e.getMessage();
        }
    }
}
