package com.berkhayta._17_JsonToObject;

import com.google.gson.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepository {
    public List<User> getUsers(int count){
        List<User> userList=new ArrayList<>();
        Scanner sc;
        String data="";
        try {
            sc=new Scanner(new URL("https://randomuser.me/api/?results="+count).openStream());
            //System.out.println(sc.nextLine());
            data=sc.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson=new Gson();
        JsonElement jsonElement = JsonParser.parseString(data);
        //System.out.println("jsonElement:..."+jsonElement);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        // bunun içinde 2 tane yapı var. birisi results, diğeri de info
        JsonArray resultJsonArray = asJsonObject.get("results").getAsJsonArray();
       // System.out.println("resultJsonArray..."+resultJsonArray);
        for (int i = 0; i < resultJsonArray.size(); i++) {
            JsonObject userJsonObject = resultJsonArray.get(i).getAsJsonObject();
            User user = gson.fromJson(userJsonObject, User.class);
            //System.out.println("------------------------------------");
            //System.out.println("userJsonObject:...."+userJsonObject);
            //System.out.println(user);
            userList.add(user);
        }

        return userList;
    }
}
