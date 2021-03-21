package com.company;
import java.time.LocalDateTime;

public class File {
    private String fileId;
    private String fileName;
    private float fileSize;
    private String fileType;
    private String fileCreated;
    private static int counter;

    public File(String fileName, float fileSize, String fileType)
    {
        this.fileId = FileIdCreator();
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.fileCreated = fileCreated;
    }

    public String getFileName()
    {
        return fileName;
    }
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
    public float getFileSize()
    {
        return fileSize;
    }
    public void setFileSize(float fileSize)
    {
        this.fileSize = fileSize;
    }
    public  String getFileType()
    {
        return fileType;
    }
    public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }

    public LocalDateTime DateIncrementer()
    {
        LocalDateTime fileCreated = LocalDateTime.now();
        return fileCreated;
    }

    public void FileTypeChecker(String fileType)
    {
        try
        {
            if(fileType == "txt" || fileType == "doc" || fileType == "jpg" || fileType == "png")
            {
                System.out.println(fileType);
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("You have to put one of this four file types!!!:- txt, doc, jpg, png");
        }
    }
    public String FileIdCreator()
    {
        if(fileType == "txt")
        {
            return "txt_" + ++counter;
        }
        else if(fileType == "doc")
        {
            return "doc_" + ++counter;
        }
        else if(fileType == "jpg")
        {
            return "jpg_" + ++counter;
        }
        else if(fileType == "png")
        {
            return "png_" + ++counter;
        }

        return fileId;
    }
    public void FileSizeChecker(float fileSize)
    {
        try
        {
            if(fileSize <= 5 && fileSize >= 0)
            {
                System.out.println(fileSize);
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("This file size is larger than your mom!!");
        }

    }
}
