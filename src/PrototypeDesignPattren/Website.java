package PrototypeDesignPattren;
import java.util.*;
import java.io.*;

public class Website implements Cloneable{
    private String name;
    List<Page> pages=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
    public void loadPages()
    {
        for(int i=0;i<10;i++)
        {
            Page p=new Page();
            p.setId(i);
            p.setTitle("title "+i);
            getPages().add(p);
        }
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    /*
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
    protected Website clone() throws CloneNotSupportedException
    {
        Website site=new Website();
        for(Page p:this.getPages())
        {
            site.getPages().add(p);
        }
        return  site;
    }
}
