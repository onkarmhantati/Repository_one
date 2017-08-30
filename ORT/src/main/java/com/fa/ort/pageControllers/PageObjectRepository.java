package com.fa.ort.pageControllers;



import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;
import java.util.HashMap;

/**
 * Created by Onkar on 7/12/2017.
 */
public class PageObjectRepository  {
    private static HashMap<String, Config> listOfPages= LoadGuiObjectRepository();

    public static HashMap<String,Config> LoadGuiObjectRepository(){
        listOfPages=new HashMap<String,Config>();
        File[] pageObjectRepositories = getGuiMapFiles();

        for(File f: pageObjectRepositories){

            f.getAbsolutePath();

            Config pageGui= ConfigFactory.parseFile(f);

            listOfPages.put(f.getName().split(".conf")[0],pageGui);

            pageGui=null;
        }

        return listOfPages;
    }

    private static File[] getGuiMapFiles(){
        System.out.println("Current Location: "+ System.getProperty("user.dir"));

        String currentLocation= System.getProperty("user.dir");
        File folder=new File(currentLocation+"/src/test/resources/objectRepo");

        File[] listOfFiles=folder.listFiles();
        return listOfFiles;
    }

    public static Config getObjectRepo(String pageName){return listOfPages.get(pageName);}

}
