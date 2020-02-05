package com.online.banking.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;

@Service
public class FileService {

    @Value("${dir.upload}")
    public String uploadDir;

    public String uploadFile(MultipartFile file,String type) throws Exception {
        try {
            String relativePath =  File.separator;
            if(type == "media"){
                relativePath += "medias" + File.separator;
            }else if(type == "candidate"){
                relativePath += "candidates" + File.separator;
            }else{
                relativePath += "electoral" + File.separator;
            }
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String extenstion = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String fileName = String.valueOf(timestamp.getTime())+extenstion;
            relativePath += fileName;
            Path copyLocation =  Paths.get(uploadDir + relativePath);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
            return relativePath;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Could not store file " + file.getOriginalFilename()+ ". Please try again!");
        }
    }
}