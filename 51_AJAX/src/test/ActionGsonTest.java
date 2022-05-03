package test;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ucamp.model.Writer;

public class ActionGsonTest {
	public static void main(String[] args) {
		
		//{"writerNumber":"01", "name":"ȫ�浿"}
		JsonObject j1=new JsonObject();
		j1.addProperty("writerNumber", "01");
		j1.addProperty("name", "ȫ�浿");
		
		System.out.println(j1.toString());
		
		Writer w1=new Writer(10, "hello", "korea", "ȫ�浿", "2001-01-02");
		Gson g=new Gson();
		String w1Json = g.toJson(w1);
		
		System.out.println(w1Json);
		Writer w2=new Writer(11, "hihi", "korea", "ȫ�浿", "2001-01-02");
		
		Collection<Writer> list=new ArrayList<Writer>();
		list.add(w1);
		list.add(w2);
	
		System.out.println(new Gson().toJson(list));
	}
}
