package com.example.brett.guideapp;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gedion on 2/7/15.
 */
public class DensityInterface {
    private final static String TOKEN = "?auth_token=L0CH22KANLF77H8XFHQAZOG537U7L63T";
    private final static String BASE = "http://density.adicu.com";
    private final static String CURRENT_DATA = BASE+"/latest"+TOKEN;
    private final static String BUILDINGS = "http://density.adicu.com/docs/building_info";
    private final int WAIT_TIME = 1000 * 60 * 15;
    private ConcurrentHashMap<String,Location> locations = new ConcurrentHashMap<>();

    public Location getInfo(String name)
    {
        return locations.get(name);
    }
    public ConcurrentHashMap<String,Location> getMap()
    {
        return locations;
    }
    public static class Location
    {
        String name;
        String building;
        int occupants = 0;
        String time = null;
    }
    Thread updator = new Thread(){
        public void run()
        {
            while(true){
                try {
                    Thread.sleep(WAIT_TIME);
                    commLatest = new Communicator(CURRENT_DATA);
                    commLatest.execute();
                }
                catch (InterruptedException e)
                {

                }
            }

        }

    };
    Communicator commBuildings;
    Communicator commLatest;


    public DensityInterface()
    {
        commBuildings = new Communicator(BUILDINGS);
        commBuildings.execute();
       commLatest= new Communicator(CURRENT_DATA);
        commLatest.execute();
        updator.start();
    }

    public String getResult()
    {
        if(commLatest!=null) {
            if (commLatest.finished)
                return commLatest.result;
            else
                return null;
        }
        return null;
    }

   private class Communicator extends AsyncTask<Void, Void,String>{
       String url;
       String result;
       boolean finished = false;
       private Communicator(String url)
       {
           this.url = url;
       }
       public String doInBackground(Void... strings)
       {
           // this.url = strings[0];
           return getJSONString();
       }
       @Override
       protected void onPostExecute(String result) {
           if(this.url.equals(CURRENT_DATA))
               this.result = parseCurrent(result);
           else if (this.url.equals(BUILDINGS))
                this.result = parseBuildings(result);
           finished = true;

       }

       public String parseCurrent(String result)
       {
           JSONObject json = null;
           String tempText = "";
           try {
               json = new JSONObject(new JSONTokener(result));
               JSONArray list = json.getJSONArray("data");
               for(int i = 0; i< list.length();i++) {
                   JSONObject temp = list.getJSONObject(i);
                    Location j = locations.get(temp.getString("group_name"));
                   tempText+= temp.getString("group_name");
                   tempText+="     ";
                   tempText+=temp.getString("parent_name")+"    ";
                   tempText+=temp.getInt("client_count")+"    ";
                   j.occupants = temp.getInt("client_count");
                   j.time = temp.getString("dump_time").replace("GMT", "EST");
                   tempText+=temp.getString("dump_time").replace("GMT","EST")+"\n";
               }
               return tempText;
           }
           catch (JSONException e)
           {
                return null;
           }
       }

       public String parseBuildings(String result)
       {
           JSONObject json = null;
           String tempText = "";
           try {
               json = new JSONObject(new JSONTokener(result));
               JSONArray list = json.getJSONArray("data");
               for(int i = 0; i< list.length();i++) {
                   JSONObject temp = list.getJSONObject(i);
                    Location j = new Location();
                   tempText+= temp.getString("group_name");
                   j.name = temp.getString("group_name");
                   j.building = temp.getString("parent_name");
                   tempText+="     ";
                   tempText+=temp.getString("parent_name")+"\n";
                   locations.put(j.name,j);
               }
               return tempText;
           }
           catch (JSONException e)
           {
               return e.toString();
           }
       }

       public String getJSONString()
       {
           HttpURLConnection urlConnection = null;
           try {
               URL url = new URL(this.url);

               urlConnection = (HttpURLConnection) url.openConnection();
               urlConnection.setReadTimeout(10000 /* milliseconds */);
               urlConnection.setConnectTimeout(15000 /* milliseconds */);
               urlConnection.setRequestMethod("GET");
               urlConnection.setDoInput(true);
               urlConnection.connect();
               BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
               String text="";
               String temp;
               while((temp=reader.readLine())!=null)
               {
                   text+=(temp+"\n");
               }
               return text;

           }
           catch (IOException e)
           {

           }
           finally {
               if(urlConnection !=null)
                 urlConnection.disconnect();
           }
           return null;
       }

   }
}
