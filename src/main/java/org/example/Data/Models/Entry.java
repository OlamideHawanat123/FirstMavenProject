package org.example.Data.Models;

import java.time.LocalDate;

public class Entry {
    private String id;
    private  String title;
    private String content;
    LocalDate dateCreated;
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    } 

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setDateCreated(){
        this.dateCreated = LocalDate.now();
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }


}
